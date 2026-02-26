package selenium.basics.webelementdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.get("https://www.letskodeit.com/practice");

        WebElement showBtn = driver.findElement(By.id("show-textbox"));
        WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
        WebElement textBox = driver.findElement(By.id("displayed-text"));

        System.out.println(textBox.isDisplayed());    //true
        hideBtn.click();
        System.out.println(textBox.isDisplayed());    //false
        showBtn.click();
        System.out.println(textBox.isDisplayed());    //true

        driver.close();

    }
}
