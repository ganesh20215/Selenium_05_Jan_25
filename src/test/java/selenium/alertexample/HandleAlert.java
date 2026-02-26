package selenium.alertexample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.navigate().to("https://www.letskodeit.com/practice");

        driver.findElement(By.id("confirmbtn")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
//        alert.dismiss();

        //driver.findElement(By.id("hondacheck")).click();
    }
}
