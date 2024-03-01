package Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

     static  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();//ekranı max yapıyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti implicitly
         wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }



    public static void BekleKapat() {
        Myfunc.Bekle(5);
        driver.quit();
    }


}
