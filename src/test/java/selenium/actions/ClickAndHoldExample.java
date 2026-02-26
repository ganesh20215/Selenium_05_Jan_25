package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndHoldExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        WebElement elementA = driver.findElement(By.name("A"));

        Actions a = new Actions(driver);
        a.clickAndHold(elementA)
                .pause(Duration.ofSeconds(10))
                .release(elementA)
                .build()
                .perform();
    }
}
