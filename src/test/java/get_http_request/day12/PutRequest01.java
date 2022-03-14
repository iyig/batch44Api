package get_http_request.day12;

import base_url.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import test_data.JsonPlaceHolderTestData;

import static io.restassured.RestAssured.given;

public class PutRequest01 extends JsonPlaceHolderBaseUrl {

/*
https://jsonplaceholder.typicode.com/todos/198 URL ine aşağıdaki body gönerdiğimde

{
"userId": 21,
"title": "Wash the dishes",
"completed": false
}
Dönen response un status kodunun 200 ve body 'i Put ettiginizde kısmının aşağıdaki gibi olduğunu test edin
{
"userId": 21,
"title": "Wash the dishes",
"completed": false,
"id": 198
}
*/
@Test
    public void test(){
    //1) URL OLUSTUR

    spec04.pathParams("bir", "todos", "iki" ,"198");

// 2) EXPECTED DATA
    JsonPlaceHolderTestData testObje = new JsonPlaceHolderTestData();
    JSONObject expectedRequest = testObje.setUpPutDate();
    System.out.println("expectedRequest =" +expectedRequest);

    //3) REQUEST RESPONSE
    Response response = given().contentType(ContentType.JSON)
            .spec(spec04).body(expectedRequest.toString()).when().put("/{bir}/{iki}");
    response.prettyPrint();

    // DOGRULAMA
    // Json Path
    JsonPath json = response.jsonPath();
    Assert.assertEquals("200",response.getStatusCode());
    Assert.assertEquals(expectedRequest.getInt("userId"), json.getInt("userId"));
    Assert.assertEquals(expectedRequest.getString("title"), json.getString(""));
    Assert.assertEquals(expectedRequest.getBoolean("completed"),json.getBoolean("completed"));
}

}
