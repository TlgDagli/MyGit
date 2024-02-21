package Odev;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SnapDeal extends BaseDriver {
    @Test
    public void snapdealtest(){
        driver.get("https://www.snapdeal.com/");
        Myfunc.Bekle(1);
        WebElement search=driver.findElement(By.cssSelector("[id='inputValEnter'][type='text']"));
        search.sendKeys("teddy bear");
        Myfunc.Bekle(1);
        WebElement click=driver.findElement(By.cssSelector("[class='searchTextSpan']"));
        click.click();
        Myfunc.Bekle(1);
        WebElement check=driver.findElement(By.cssSelector("[class='nnn']"));
        Assert.assertTrue("Aranılan mesaj bulunamadı!",check.getText().contains("results for teddy bear"));
        BekleKapat();




    }
}
