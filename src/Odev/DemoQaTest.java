package Odev;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoQaTest extends BaseDriver {
    @Test
    public void demoqa(){
        driver.get("https://demoqa.com/text-box");
        WebElement fullname=driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        fullname.sendKeys("Automation");
        Myfunc.Bekle(1);
        WebElement email=driver.findElement(By.cssSelector("[placeholder='name@example.com'][type='email']"));
        email.sendKeys("Testing@gmail.com");
        Myfunc.Bekle(1);
        WebElement current=driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        current.sendKeys("Testing Current Address");
        Myfunc.Bekle(1);
        WebElement permanent=driver.findElement(By.cssSelector("[id='permanentAddress'][class='form-control']"));
        permanent.sendKeys("Testing Permanent Address");
        Myfunc.Bekle(1);
        WebElement submit=driver.findElement(By.cssSelector("[type='button'][class='btn btn-primary']"));
       submit.click();
        Myfunc.Bekle(1);
        WebElement checkname=driver.findElement(By.cssSelector("[id='name'][class='mb-1']"));
        Assert.assertTrue("Aranılan mesaj bulunamadı!", checkname.getText().contains("Automation"));
        WebElement checkmail=driver.findElement(By.cssSelector("[id='email'][class='mb-1']"));
        Assert.assertTrue("Aranılan mesaj bulunamadı!",checkmail.getText().contains("Testing"));
        BekleKapat();




    }
}
