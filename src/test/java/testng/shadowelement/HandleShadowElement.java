package testng.shadowelement;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleShadowElement {

    @Test
    public void howToHandleShadowElement() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.camposcoffee.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        WebElement shadowHost = driver.findElement(By.cssSelector("div[class='mcforms-wrapper needsclick']"));
        Thread.sleep(2000);

        SearchContext shadowRoot = shadowHost.getShadowRoot();
        Thread.sleep(2000);

        shadowRoot.findElement(By.cssSelector("button[class=' animation-finished']")).click();

    }
}
