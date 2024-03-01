import Utility.BaseDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AkakceTest extends BaseDriver {
    @Test
    public void akakce(){
        driver.get("https://www.akakce.com/");
        WebElement hspac=driver.findElement(By.xpath("//a[text()='Hesap Aç']"));
        hspac.click();
        WebElement ad=driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("Sdet");

        WebElement soyad=driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyad.sendKeys("Tears");

        WebElement mail=driver.findElement(By.xpath("//input[@id='rnufe1']"));
        mail.sendKeys("deneme@gmail.com");

        WebElement mail2=driver.findElement(By.xpath("//input[@id='rnufe2']"));
        mail2.sendKeys("deneme@gmail.com");

        WebElement pass1=driver.findElement(By.xpath("//input[@id='rnufp1']"));
        pass1.sendKeys("Sdet123");

        WebElement pass2=driver.findElement(By.xpath("//input[@id='rnufp2']"));
        pass2.sendKeys("Sdet123");

        WebElement gender=driver.findElement(By.xpath("//input[@id='rngm']"));
        gender.click();

        WebElement il= driver.findElement(By.xpath("//select[@id='locpr']"));
        Select ilSelect=new Select(il);
        ilSelect.selectByIndex(1);

BekleKapat();



    }


}
