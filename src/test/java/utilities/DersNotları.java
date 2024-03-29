/*

API DERSİNDE NELER ÖĞRENDİNİZ?

        * POSTMAN

        * Rest Assured: REST API'lerini test etmek ve doğrulamak için kullanılan
        Open Source (Açık Kaynak) bir Java kütüphanesidir.

        * JUnit Assert'leri kullanılarak doğrulama

        * Json Path kullanarak doğrulama
        JsonPath() json = response.JsonPath();

        * Matchers Class kullanarak doğrulama
        http://hamcrest.org/JavaHamcrest/javadoc/1.3/org/hamcrest/Matchers.html

        Matchers.equalto(): Key-Value şeklinde girilen datanın, eşit olduğunu doğrulamak için kullanılır.
        Matchers.hasSize(): Datanın size'ını doğrulamak için kullanılır.eleman sayısını assert eder
        Matchers.hasItem(): Girilen tek bir data'yı doğrulamak için kullanılır.contains() methodu gibi objenin içerilip içerilmediğini asssert eder
        Matchers.hasItems(): Girilen birden fazla datayı doğrulamak için kullanılır.containsAll() methodu gibi bir den fazla objenin içerilip içerilmediğni assert eder

        * De-Serialization: JSON formatını Javaya dönüştürme
        HashMap<String, Object> actualData = response.as(HashMap.class);

        * Serialization: Java yapısında olan dataları JSON'a dönüştürme
        Gson gson = new Gson();
        String jsonFromJava = gson.toJson(actual);

        * JSON Object
        JsonPlaceHolderTestData testObje = new JsonPlaceHolderTestData();
        JSONObject expectedRequest = testObje.setUpPostData();

        * Pojo Class (Plain Old Java Object)

        * ObjectMapper: JSON ve POJO (Plain Old Java Objects) okuma ve yazma işlevlerinin yanı sıra
        dönüştürmeleri gerçekleştirmek için de kullanılır.

        * API den alınan response'ları bilgisayara text dosyası olarak kaydetme ve doğrulama yapma.

        * Reusable method oluşturma.


        1) API testlerinde Web Driver kullanıyor musunuz? Hangi dependencies'leri kullanıyorsunuz?
        API testlerinde, UI testleri için gerekli Web Driver dependencies'lere ihtiyaç yoktur.
        Başlangıç için Rest-Assured veye JUnit ve TEstNG gibi dependencies'ler yeterli olur.

        2) Doğrulama için kullanılan, Hard Assert ve Verification farkları nelerdir?
        Hard Assert kullandığımızda ilk hata olan yerde test durur.
        Verification'da; testler hata olsa dahi çalışır. Hatalı olan test için hata mesajı alınır.
        ÖNEMLİ: Soft Assert = Verification

        3) API testlerinde request nasıl tanımlanır?
        given().when().get() içerisinde tanımlanır.

        4) Request'ten gelen cevap (response) nerede saklanır?
        Response response'un içerisinde.

        5) assertThat() Hard mı yoksa Soft Assert müdür?
        assertThat() Hard assertion'dır.


        TEST iÇiN KULLANILAN ADRESLER

        https://restful-booker.herokuapp.com/booking

        https://reqres.in/api/users

        http://dummy.restapiexample.com/api/v1/employee

        https://jsonplaceholder.typicode.com/

        https://www.gmibank.com/api/authenticate

        http://www.gmibank.com/api/tp-customers

 */