package Odev;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AppliToolsTest extends BaseDriver {
    @Test
    public void applitools(){
        driver.get("https://demo.applitools.com/");
        WebElement username=driver.findElement(By.cssSelector("[placeholder='Enter your username'][type='text']"));
        username.sendKeys("ttechno@gmail.com");
        Myfunc.Bekle(1);
        WebElement pass=driver.findElement(By.cssSelector("[placeholder='Enter your password'][type='password']"));
        pass.sendKeys("techno123.");
        Myfunc.Bekle(1);
        WebElement click=driver.findElement(By.cssSelector("[class='btn btn-primary'][href='/app.html']"));
        click.click();
        Myfunc.Bekle(1);
        WebElement check=driver.findElement(By.cssSelector("h6[id ='time']"));
        Assert.assertTrue("Aranılan mesaj bulunamadı!",check.getText().contains("Your nearest branch closes in: 30m 5s"));
        BekleKapat();







    }
}
