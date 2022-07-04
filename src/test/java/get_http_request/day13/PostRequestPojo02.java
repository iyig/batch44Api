package get_http_request.day13;

import base_url.HerOkuAppBaseUrl;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.AssertionSupport;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.BookingDatesPojo;
import pojos.BookingPojo;
import pojos.BookingResponsePojo;

import static io.restassured.RestAssured.given;

public class PostRequestPojo02 extends HerOkuAppBaseUrl {

    @Test
    public void test(){

        //1) URL OLUSTUR
        spec05.pathParam("bir", "booking");

        //2) EXPECTED DATA OLUSTUR
        BookingDatesPojo bokingDates = new BookingDatesPojo("2022-03-01", "2022-03-11");
        System.out.println("bokingDates = " + bokingDates);

        BookingPojo bookingPojo = new BookingPojo("Ali", "Can", 500,
                true, bokingDates);
        System.out.println("bookingPojo = " + bookingPojo);

        //3) RESPONSE AND REQUEST
        Response response = given().contentType(ContentType.JSON)
                .spec(spec05)
                .auth()
                .basic("admin", "password123")
                .body(bookingPojo)
                .when()
                .post("/{bir}");
        response.prettyPrint();

        //4) DOĞRULAMA
        BookingResponsePojo actualData = response.as(BookingResponsePojo.class);
        System.out.println("actualData = " + actualData);

        Assert.assertEquals(200, response.getStatusCode());

        Assert.assertEquals(bookingPojo.getFirstname(),actualData.getBookingPojo().getFirstname());
        Assert.assertEquals(bookingPojo.getLastname(), actualData.getBookingPojo().getLastname());
        Assert.assertEquals(bookingPojo.getTotalprice(), actualData.getBookingPojo().getTotalprice());
        Assert.assertEquals(bookingPojo.isDepositpaid(), actualData.getBookingPojo().isDepositpaid());

        Assert.assertEquals(bookingPojo.getBookingDatesPojo().getChecking(),
                actualData.getBookingPojo().getBookingDatesPojo().getChecking());

        Assert.assertEquals(bookingPojo.getBookingDatesPojo().getCheckout(),
                actualData.getBookingPojo().getBookingDatesPojo().getCheckout());
    }
}