package get_http_request.day14;

import base_url.HerOkuAppBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import utilities.JsonUtil;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GetRequestObjectMapper03 extends HerOkuAppBaseUrl {

/*
 https://restful-booker.herokuapp.com/booking/2 url'ine bir get request gönderildiğinde,
 status kodun 200 ve response body'nin
{
    "firstname": "Mary",
    "lastname": "Smith",
    "totalprice": 560,
    "depositpaid": true,
    "bookingdates": {
        "checkin": "2015-10-27",
        "checkout": "2020-05-22"
    }
}

Olduğunu Object Mapper kullanarak test edin.
*/

    @Test

    public void test() {
        spec05.pathParams("parametre1", "booking", "parametre2", 2);

        String jsonData ="{\n" +
                "    \"firstname\": \"Mary\",\n" +
                "    \"lastname\": \"Smith\",\n" +
                "    \"totalprice\": 560,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2015-10-27\",\n" +
                "        \"checkout\": \"2020-05-22\"\n" +
                "    }\n" +
                "}";

        HashMap<String,Object> expectedData= JsonUtil.convertJsonToJava(jsonData, HashMap.class);
        System.out.println(expectedData);


        Response response = given().contentType(ContentType.JSON).spec(spec05).
                when().get("/{parametre1}/{parametre2}");

        response.prettyPrint();


       HashMap<String,Object> actualData= JsonUtil.convertJsonToJava(response.asString(),HashMap.class);
        System.out.println(actualData);
        Assert.assertEquals(expectedData.get("firstname"),actualData.get("firstname"));
        Assert.assertEquals(expectedData.get("lastname"),actualData.get("lastname"));
        Assert.assertEquals(expectedData.get("totalprice"), actualData.get("totalprice"));
        Assert.assertEquals(expectedData.get("depositpaid"), actualData.get("depositpaid"));
        Assert.assertEquals(((Map)expectedData.get("bookingdates")).get("checking"),
                ((Map)actualData.get("bookingdates")).get("checking"));

        Assert.assertEquals(((Map)expectedData.get("bookingdates")).get("checkout"),
                ((Map)actualData.get("bookingdates")).get("checkout"));
    }
}