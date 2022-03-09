package day02_driverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
public class C02_DriverGetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle()); //sayfanin title.'ini getirir

        System.out.println(driver.getCurrentUrl()); // sayfanin adresini getirir

        System.out.println(driver.getWindowHandle());//CDWindow-0856665367EB1E1B782DB502DF6CC3B8

        System.out.println(driver.getPageSource()); //web sayfasini tüm kodlari


        //driver.get ile ayni islemi yapar ama daha hizlidir


    }
    }