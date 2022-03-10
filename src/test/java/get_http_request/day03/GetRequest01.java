package get_http_request.day03;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {
//1- API testi yaparken ilk olarak url(endpoint) belirlenmeli
//String url ="https://restful-booker.herokuapp.com/booking" ;

//2- beklenen sonuç(expected result oluşturulur
//- Bu case de benden body doğrullaması istemediği icin şimdilik beklenen sonuç oluşturmuyoruz
    //3- request gönder(get,post)

    //4- actual result oluştur
    //5-doğrulama yap(assertion)
@Test
    public void test01(){
    String url ="https://restful-booker.herokuapp.com/booking";
  Response response = given().when().get(url);
   response.prettyPrint();
   System.out.println("Status Code:"+response.statusCode());
    System.out.println("Content Type:"+response.contentType());
    System.out.println("TestZamani:"+response.time());
    System.out.println("Status Line:"+response.statusLine());


    Assert.assertEquals(200,response.statusCode());
    Assert.assertEquals("application/json; charset=utf-8", response.contentType());
    Assert.assertEquals("HTTP/1.1 200 OK", response.statusLine());

    response
            .then()
            .assertThat()
            .statusCode(200)
            .contentType("application/json; charset=utf-8")
            .statusLine("HTTP/1.1 200 OK");


    }

}
