package selenium.basics.desiredcapability;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicOfDesiredCapability {

    public static void main(String[] args) {
        ChromeOptions cp = new ChromeOptions();
        cp.setBinary("D:\\classes\\Edso\\AutomationTesting\\Selenium\\WebDriver_Version\\chrome-win64\\chrome-win64\\chrome.exe");
        //cp.addArguments("--headless");
        cp.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(cp);  //Upcasting in Java
        //WebDriver driver = new ChromeDriver();
        driver.get("https://self-signed.badssl.com/");

        //driver.close();
    }
}
