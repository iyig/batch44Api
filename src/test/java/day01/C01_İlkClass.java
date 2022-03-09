package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_İlkClass {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        //biz driver objesi olusturdugumuzda bos bir crome browser açılı

   driver.get("https://www.ebay.com");
//driver.geet methodu drivera gidecegi web adresini girmemizi saglar


       Thread.sleep(3000);



        driver.close();
   // driveri kapatir
    }

}
