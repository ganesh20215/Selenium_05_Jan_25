package selenium.basics.webelementdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //sendKeys()
        //WebElement element = driver.findElement(By.id("login1"));
        //element.sendKeys("Tanush");

        //clear()
        //Thread.sleep(2000);
        //element.clear();

        //submit()
        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.className("signin-btn"));
        //loginBtn.submit();

        //getText()
        //System.out.println(loginBtn.getText());

        //getTagName()
        //System.out.println(loginBtn.getTagName());

        //getDomAttribute()
        //System.out.println(loginBtn.getDomAttribute("class"));
    }
}
