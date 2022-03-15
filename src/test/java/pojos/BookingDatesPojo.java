package pojos;

public class BookingDatesPojo {

/*

"bookingdates": {
               "checkin": "2022-03-01",
               "checkout": "2022-03-11"
 }
*/

    // 1) private değişkenler olustur
    private String checking;
    private String checkout;

    // 2) getter ve setter oluştur

    public String getChecking() {
        return checking;
    }

    public void setChecking(String checking) {
        this.checking = checking;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    //3) Parametreli ve Parametresiz Constructor oluştur


    public BookingDatesPojo(String checking, String checkout) {
        this.checking = checking;
        this.checkout = checkout;
    }

    public BookingDatesPojo() {

    }

       //4) toString
        @Override
        public String toString() {
            return "BookingDatesPojo{" +
                    "checking='" + checking + '\'' +
                    ", checkout='" + checkout + '\'' +
                    '}';
        }

}


