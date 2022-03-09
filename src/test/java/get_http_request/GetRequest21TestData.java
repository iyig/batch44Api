package get_http_request;

import Test_data.JsonPlaceHolderTestData;
import base_url.JsonPlaceHolderBaseUrl;
import groovy.lang.DelegatesTo;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest21TestData extends JsonPlaceHolderBaseUrl {

 /*
        https://jsonplaceholder.typicode.com/todos/2
        1) Status kodunun 200,
        2) respose body'de,
         "completed": değerinin false
         "title": değerinin "quis ut nam facilis et officia qui"
         "userId" sinin 1 ve
        header değerlerinden
         "via" değerinin "1.1 vegur" ve
         "Server" değerinin "cloudflare" olduğunu test edin…
*/
@Test
    public void test21(){

    //1) URL OLUSTUR
    spec04.pathParams("1","todos","2" ,2);

//2)EXPECTED DATAOLUSTUR
JsonPlaceHolderTestData expectedDataObje= new JsonPlaceHolderTestData();
    HashMap<String, Object> expectedData=(HashMap<String,Object>) expectedDataObje.setUpTestData();
    System.out.println("Test Datanın icindeki Expected Data:"+expectedData);
//{Server=cloudflare,
// completed=false,
// title=quis ut nam facilis et officia qui,
// userId=1,
// statusCode=200,
// via=1.1 vegur}
    //3) Request ve Response

    Response response = given().spec(spec04).when().get("/{1}/{2}");
    response.prettyPrint();

    //DOGRULAMA
    //1.YOL MATCHERS
    response.then().assertThat().statusCode((Integer)expectedData.get("statusCode"))
            .headers("via", equalTo(expectedData.get("via")),
            "Server", equalTo(expectedData.get("Server")))
            .body("userId", equalTo(expectedData.get("userId")),
            "title", equalTo(expectedData.get("title")),
            "completed", equalTo(expectedData.get("completed")));

    //2. YOL JSON PATH
    JsonPath json = response.jsonPath();

        Assert.assertEquals(expectedData.get("statusCode"), response.statusCode());
        Assert.assertEquals(expectedData.get("via"), response.getHeader("via"));
        Assert.assertEquals(expectedData.get("Server"), response.getHeader("Server"));

        Assert.assertEquals(expectedData.get("userId"), json.getInt("userId"));
        Assert.assertEquals(expectedData.get("title"), json.getString("title"));
        Assert.assertEquals(expectedData.get("completed"), json.getBoolean("completed"));

    //3. YOL DE-SERiALiAZATiON
    HashMap<String, Object> actualData = response.as(HashMap.class);
        System.out.println(actualData);

        Assert.assertEquals(expectedData.get("userId"), actualData.get("userId"));
        Assert.assertEquals(expectedData.get("title"), actualData.get("title"));
        Assert.assertEquals(expectedData.get("completed"), actualData.get("completed"));

}
}



