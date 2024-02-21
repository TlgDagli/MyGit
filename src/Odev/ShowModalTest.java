package Odev;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShowModalTest extends BaseDriver {
    @Test
    public void showModal(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fake= driver.findElement(By.cssSelector("ul> :nth-child(6)>ul>li+li>a"));
        fake.click();
        Myfunc.Bekle(1);
        WebElement alert= driver.findElement(By.cssSelector("[class='page-body'] > :nth-child(9)>input"));
        alert.click();
        Myfunc.Bekle(1);
        WebElement button= driver.findElement(By.cssSelector("[class='dialog-actions']> button"));
        button.click();
        BekleKapat();


    }
}
