package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifySoftAssertExample(){

        SoftAssert sf = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        WebElement passwordTextBox = driver.findElement(By.id("password"));
        WebElement swagLabsText = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

        sf.assertEquals(swagLabsText.getText(), "swag labs", "swag labs text should be match");
        sf.assertFalse(userNameTextBox.isDisplayed(), "Username text box shouldn't be displayed");
        sf.assertTrue(passwordTextBox.isDisplayed());

        sf.assertAll();

        driver.close();
    }
}
