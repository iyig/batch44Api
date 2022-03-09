package day02_driverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    // normalde selenium'un kendi ide si de var fakat biz daha kullanisli oldugu icin intelliJ kullaniyiruz
    // intelliJ'de yeni bir proje actigimizda oncelikle selenium kutuphanelerini projeye eklememiz lazim
    // biz en ilkel haliyle projemize kutuphaneleri jar dosyalari olarak yukledik
    // bu ekledigimiz dosyalarla artik driver'in ayarlarini yapabiliriz
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        // setProperty methodu iki parametre ister
        // ilki kullanacagimiz browser'a ait driver
        // ikinci parametre ise selenium sitesinden indirip projemize ekledigimiz chromedriver'in path'i
        // windows kullanicilari sona .exe eklerken apple kullananlar .exe eklememeli
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        Thread.sleep(3000);
//java'dan gelir, icine yazilan milisaniye kadar kodların calismasını durdurur

        driver.close();
   // driver.close classin sonuna yazilir.Çünkü bu kod çalışınca driver'ımız kapanir
        //bu koddan sonra yeniden bir browser acmak istiyorsak driver'a yeni deger atamaliyiz
    }
}
