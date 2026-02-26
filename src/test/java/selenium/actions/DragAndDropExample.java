package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.navigate().to("https://selenium08.blogspot.com/2020/01/drag-drop.html");

        WebElement srcE = driver.findElement(By.id("draggable"));
        WebElement destE = driver.findElement(By.id("droppable"));

        Actions a = new Actions(driver);
        a.dragAndDrop(srcE, destE).perform();
    }
}
