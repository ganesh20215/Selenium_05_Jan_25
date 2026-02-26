package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGIntroduction {

    public WebDriver driver;

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @BeforeMethod
    public void setup(){
         driver = new ChromeDriver();
    }

    @Test
    public void verifyEdsoServices(){
        driver.get("https://www.edso.in/");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyAmazon(){
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyGoogle(){
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
}
