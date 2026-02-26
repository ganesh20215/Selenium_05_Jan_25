package selenium.uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UploadFileExample {

    public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();  //Upcasting in Java
            driver.navigate().to("https://the-internet.herokuapp.com/upload");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            driver.findElement(By.id("file-upload")).sendKeys("D:\\classes\\Edso\\AutomationTesting\\Automation Framework.pptx");
            driver.findElement(By.id("file-submit")).click();

            WebElement uploadMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));

            if (uploadMessage.isDisplayed()){
                System.out.println("File sucessfully uploaded..");
            }else {
                System.out.println("File isn't uploaded..");
            }

            driver.close();
    }
}
