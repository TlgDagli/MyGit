package Odev;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EvilTesterTest1 extends BaseDriver {
    @Test
    public void eviltester() {
        driver.get("https://testpages.eviltester.com/styled/index.html");
        WebElement calculator = driver.findElement(By.cssSelector("[href='calculator'][id='calculatetest']"));
        calculator.click();
        WebElement input1 = driver.findElement(By.cssSelector("[class='form-label'] > input"));
        input1.sendKeys("5");
        WebElement input2 = driver.findElement(By.cssSelector("[class='form-label'] >  input+select+input"));
        input2.sendKeys("10");
        WebElement calclick = driver.findElement(By.cssSelector("[action='calculator']> div+div>input"));
        calclick.click();
        WebElement sonuc = driver.findElement(By.cssSelector("[class='centered'] > div>p>span"));
        System.out.println("sonuc = " + sonuc.getText());
        BekleKapat();


    }
}
