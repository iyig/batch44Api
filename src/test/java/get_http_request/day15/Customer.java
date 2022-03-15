package get_http_request.day15;

public class Customer {

/*

{
    “id”: 110452,
    “firstName”: “Jasmine”,
    “lastName”: “Stehr”,
    “middleInitial”: “V”,
    “email”: “marni.zboncak@yahoo.com”,
    “mobilePhoneNumber”: “463-609-2097”,
    “phoneNumber”: “1-112-497-0270”,
    “zipCode”: “16525”,
    “address”: “14387 Al Ridge5343 Bert Burgs”,
    “city”: “Waltermouth”,
    “ssn”: “761-59-2911”,
    “createDate”: “2021-11-28T21:00:00Z”,
    “zelleEnrolled”: false,
    “country”: {
        “id”: 3,
        “name”: “USA”,
        “states”: null
    },
    “state”: “California”,
    “user”: {
        “id”: 110016,
        “login”: “leopoldo.reinger”,
        “firstName”: “Jasmine”,
        “lastName”: “Stehr”,
        “email”: “marni.zboncak@yahoo.com”,
        “activated”: true,
        “langKey”: “en”,
        “imageUrl”: null,
        “resetDate”: null
    },
    “accounts”: []
}

 */


    private int id;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String email;
    private String mobilPhoneNumber;
    private String phoneNumber;
    private String zipCode;
    private String address;
    private String city;
    private String ssn;
    private String createDate;
    private String zelleEnrolled;

    //2) getter ve setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilPhoneNumber() {
        return mobilPhoneNumber;
    }

    public void setMobilPhoneNumber(String mobilPhoneNumber) {
        this.mobilPhoneNumber = mobilPhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getZelleEnrolled() {
        return zelleEnrolled;
    }

    public void setZelleEnrolled(String zelleEnrolled) {
        this.zelleEnrolled = zelleEnrolled;
    }

//3) parametresiz ve parametreli Constructor


    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String middleInitial, String email, String mobilPhoneNumber, String phoneNumber, String zipCode, String address, String city, String ssn, String createDate, String zelleEnrolled) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.email = email;
        this.mobilPhoneNumber = mobilPhoneNumber;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.address = address;
        this.city = city;
        this.ssn = ssn;
        this.createDate = createDate;
        this.zelleEnrolled = zelleEnrolled;
    }


//4) toString


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", email='" + email + '\'' +
                ", mobilPhoneNumber='" + mobilPhoneNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", ssn='" + ssn + '\'' +
                ", createDate='" + createDate + '\'' +
                ", zelleEnrolled='" + zelleEnrolled + '\'' +
                '}';
    }
}
