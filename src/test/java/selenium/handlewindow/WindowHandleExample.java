package selenium.handlewindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("openwindow")).click();

        String parentId = driver.getWindowHandle();
        System.out.println(parentId);

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);

        for (String s : allWindows) {
            if (!s.equals(parentId)) {
                driver.switchTo().window(s);
                Thread.sleep(2000);
                driver.findElement(By.linkText("INTERVIEW")).click();
                Thread.sleep(2000);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentId);
        driver.close();
    }
}
