package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifyEdsoServices(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        WebElement passwordTextBox = driver.findElement(By.id("password"));
        WebElement swagLabsText = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

        Assert.assertEquals(swagLabsText.getText(), "swag labs");
        Assert.assertTrue(userNameTextBox.isDisplayed());
        Assert.assertTrue(passwordTextBox.isDisplayed());

        driver.close();
    }
}
