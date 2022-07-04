package get_http_request.day12;

import base_url.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import test_data.JsonPlaceHolderTestData;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PatchRequest01 extends JsonPlaceHolderBaseUrl {
    /*
 https://jsonplaceholder.typicode.com/todos/198 URL ine aşağıdaki body gönderdiğimde
 {
  "title": "Batch44"
 }
 Dönen response un status kodunun 200 ve body kısmının aşağıdaki gibi olduğunu test edin
 {
 "userId": 10,
 "title": "Batch44"
 "completed": true,
 "id": 198
 }
 */
    @Test
    public void test() {

        //1) URL OLUSTUR
        spec04.pathParams("parametre1", "todos", "parametre2", "198");
        //2) EXPECTED DATA
        JsonPlaceHolderTestData testData = new JsonPlaceHolderTestData();

        JSONObject requestData = testData.setUpPatchRequestData();
        System.out.println(requestData);

        JSONObject expectData = testData.setUpPatchExpectedData();
        System.out.println(expectData);

        //3) REQUEST VE RESPONSE

        Response response = given().
                contentType(ContentType.JSON).
                spec(spec04).
                body(requestData.toString()).when().patch("/{parametre1}/{parametre2}");
        response.prettyPrint();

        //4) DOGRULAMA
        // 1) JSonPath
JsonPath json= response.jsonPath();
Assert.assertEquals(expectData.get("userId"),json.getInt("userId"));
Assert.assertEquals(expectData.get("title"),json.getString("title"));
Assert.assertEquals(expectData.get("completed"),json.getBoolean("completed"));
Assert.assertEquals(expectData.get("id"),json.getInt("id"));


        //Matcher

        response.then().statusCode(200);
        response.then().assertThat().body("title",equalTo(expectData.getString("title"))
                ,"completed",Matchers.equalTo(expectData.getBoolean("completed"))
                ,"userId",Matchers.equalTo(expectData.getInt("userId"))
                ,"id",Matchers.equalTo(expectData.getInt("id")));

        // 3) De-Serialization

        HashMap<String,Object> actualData=response.as(HashMap.class);
        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals(expectData.getInt("userId"), actualData.get("userId"));
        Assert.assertEquals(expectData.getString("title"),actualData.get("title"));
Assert.assertEquals(expectData.getBoolean("completed"),actualData.get("completed"));
Assert.assertEquals(expectData.getInt("id"), actualData.get("id"));




    }
}