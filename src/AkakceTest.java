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

        WebElement ilce= driver.findElement(By.xpath("//select[@id='locds']"));
        Select ilceSelect=new Select(ilce);
        ilceSelect.selectByIndex(4);

        WebElement gun= driver.findElement(By.xpath("//select[@id='bd']"));
        Select gunSelect=new Select(gun);
        gunSelect.selectByIndex(25);

        WebElement ay= driver.findElement(By.xpath("//select[@id='bm']"));
        Select aySelect=new Select(ay);
        aySelect.selectByIndex(12);

        WebElement yil= driver.findElement(By.xpath("//select[@id='by']"));
        Select yilSelect=new Select(yil);
        yilSelect.selectByVisibleText("1982");

        WebElement ksggp=driver.findElement(By.xpath("//input[@id='rnufpca']"));
        ksggp.click();

        WebElement kampanya=driver.findElement(By.xpath("//input[@id='rnufnee']"));
        kampanya.click();
        WebElement olustur=driver.findElement(By.xpath("//input[@id='rfb']"));
        olustur.click();




        BekleKapat();



    }


}
