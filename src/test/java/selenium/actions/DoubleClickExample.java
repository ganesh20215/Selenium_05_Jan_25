package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.navigate().to("https://selenium08.blogspot.com/2019/11/double-click.html");

        WebElement elementA = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));

        Actions a = new Actions(driver);
        a.doubleClick(elementA).perform();
    }
}
