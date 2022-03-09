package day04_XpathCssSelector;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {

//1. Bir class oluşturun : AmazonSearchTest
//2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//    a.google web sayfasına gidin. https://www. amazon.com/
//    b. Search(ara) “city bike”
//    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
//    d. “Shopping” e tıklayın.
//    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //    a.amazon web sayfasına gidin. https://www. amazon.com/
            driver.get("https://www.amazon.com");

//    b. Search kutusuna (ara) “city bike” yazıp arattirin
         WebElement aramaKutusu=driver.findElement(By.id("twoabsearchtextbox"));
         aramaKutusu.sendKeys("city bike" + Keys.ENTER);
    //arama Kutusu.submit() yerine istersek Keys.Enter yerine bu satırı da yazabiliriz
//    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
 //WebElement sonucYazisiElementi=driver.findElement (By.xpath("//div[@class='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']")
 //Classname ile daha önce bu elementli locate edemedigimiz halde
        //xpath ile class attribute unu kullanarak locate edebildik

  WebElement sonucYazisiElementi=  driver.findElement(By.className("sg-col-inner"));


  System.out.println(sonucYazisiElementi.getText());

        // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

          WebElement İlkÜrunResmi= driver.findElement(By.className("s-image"));
            İlkÜrunResmi.click();
      //sadece click yapmak gibi basit bir islemde kullanacağımiz webelementler için
        //variable oluturmdadan direk locate edip istedipimiz islemi yapabiliriz
      driver.findElement(By.className("s-image")).click();


    }
}
