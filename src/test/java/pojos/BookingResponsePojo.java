package pojos;

public class BookingResponsePojo {

/*

{
    "bookingid": 11,
       "booking": {
                 "firstname": "Ali",
                 "lastname": "Can",
                 "totalprice": 500,
                 "depositpaid": true,
                  "bookingdates": {
                                  "checkin": "2022-03-01",
                                   "checkout": "2022-03-11"
                                  }
                 }
  }
                     */

     //1) private degiskenleri olustur

    private int bookingId;
    private BookingPojo bookingPojo;



   // 2)getter ve Setter

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public BookingPojo getBookingPojo() {
        return bookingPojo;
    }

    public void setBookingPojo(BookingPojo bookingPojo) {
        this.bookingPojo = bookingPojo;
    }
    //3) Parametreli ve parametresiz Constructor


    public BookingResponsePojo(int bookingId, BookingPojo bookingPojo) {
        this.bookingId = bookingId;
        this.bookingPojo = bookingPojo;
    }

    public BookingResponsePojo() {


    //4)  toString()


}

    @Override
    public String toString() {
        return "BookingResponsePojo{" +
                "bookingId=" + bookingId +
                ", bookingPojo=" + bookingPojo +
                '}';
    }
}