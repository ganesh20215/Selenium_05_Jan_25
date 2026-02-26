package selenium.basics.webelementdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.get("https://www.letskodeit.com/practice");

        WebElement disableBtn = driver.findElement(By.id("disabled-button"));
        WebElement enabledBtn = driver.findElement(By.id("enabled-button"));
        WebElement textBox = driver.findElement(By.id("enabled-example-input"));

        System.out.println(textBox.isEnabled());    //true
        disableBtn.click();
        System.out.println(textBox.isEnabled());    //false
        enabledBtn.click();
        System.out.println(textBox.isEnabled());    //true

        driver.close();
    }
}
