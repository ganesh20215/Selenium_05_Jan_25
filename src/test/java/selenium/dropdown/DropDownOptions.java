package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptions {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.navigate().to("https://www.letskodeit.com/practice");

        WebElement dropDown = driver.findElement(By.id("carselect"));
        Select s = new Select(dropDown);

        //selectByIndex()
        Thread.sleep(2000);
        s.selectByIndex(2);

        //selectByValue()
        Thread.sleep(2000);
        s.selectByValue("benz");

        //selectByVisibleText()
        Thread.sleep(2000);
        s.selectByVisibleText("BMW");
    }
}
