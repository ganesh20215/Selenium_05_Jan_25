package selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class HandleIframe {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.linkText("Selenium")));

        /*List<WebElement> allElements = driver.findElements(By.tagName("iframe"));
        System.out.println(allElements.size());*/

        driver.switchTo().frame("comment-editor");

        WebElement element = driver.findElement(By.xpath("//span[text()='Sign in with Google']"));

        element.click();
    }
}
