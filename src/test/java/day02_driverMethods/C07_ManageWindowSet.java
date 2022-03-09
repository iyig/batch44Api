package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// 2. Amazon sayfasına gidelim.https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        // 3. Sayfanını konumunu ve boyutlarını yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        // 4.Sayfanın konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().setSize(new Dimension(300, 500));
        // 5. sayfanın sizin istediginiz konum ve boyuta geldigini test edin
        int xKoordinat = driver.manage().window().getPosition().getX();
        int yKoordinat = driver.manage().window().getPosition().getY();
        int genislik = driver.manage().window().getSize().getWidth();
        int yukseklik = driver.manage().window().getSize().getHeight();


        Thread.sleep(3000);


        if (xKoordinat == 0 && yKoordinat == 0 && genislik == 300 && yukseklik == 500) {
            System.out.println("olceklendirme testi Pass");
        } else {
            System.out.println("olceklendirme testi Failed");
        }
    }
}