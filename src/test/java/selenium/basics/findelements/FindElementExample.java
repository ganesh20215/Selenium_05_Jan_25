package selenium.basics.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        WebElement userName = driver.findElement(By.id("lo"));
        userName.sendKeys("Kavita");
    }
}
