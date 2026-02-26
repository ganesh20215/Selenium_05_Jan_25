package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement elementA = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions a = new Actions(driver);
        a.contextClick(elementA).perform();
    }
}
