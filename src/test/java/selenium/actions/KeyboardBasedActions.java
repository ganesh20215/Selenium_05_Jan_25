package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardBasedActions {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement textBox = driver.findElement(By.xpath("(//input[@name='q'])[1]"));
        Actions a = new Actions(driver);
        Thread.sleep(2000);
        a.moveToElement(textBox)
                .click(textBox)
                .keyDown(Keys.SHIFT)
                .sendKeys("t shirt for men")
                .pause(Duration.ofSeconds(3))
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .pause(Duration.ofSeconds(3))
                .build()
                .perform();

    }
}
