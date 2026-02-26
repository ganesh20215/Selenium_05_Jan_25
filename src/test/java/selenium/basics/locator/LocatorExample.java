package selenium.basics.locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LocatorExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        //css selector with id
        //driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("Kavita");
        //driver.findElement(By.cssSelector("input#login1")).sendKeys("Kavita");


        //css selector with class
        //driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("Kavita");
        //driver.findElement(By.cssSelector("input.form-control")).sendKeys("Kavita");

        //Absolute xpath
        //driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/div[2]/div/input")).sendKeys("Kavita");

        //Relative xpath
        //driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Kavita");

        //text()
        //driver.findElement(By.xpath("//button[text()='Log In']")).click();

        //starts-with
        // {//a[starts-with(text(),'For')]}
        // {//input[starts-with(@name, 'pas')]}

        //contains()
        //{//input[contains(@name, 'swd')]}
        //{//a[contains(text(), 'got')]}

        //xpath axes
        //following xpath axes [//span[text()='Login']//following::li]

/*        Thread.sleep(2000);
        WebElement loginElement = driver.findElement(By.xpath("//span[text()='Login']"));
        Actions a = new Actions(driver);
        Thread.sleep(2000);
        a.moveToElement(loginElement).perform();

        List<WebElement> el = driver.findElements(By.xpath("//a[@title='Sign Up']//following::div"));
        for (WebElement e : el) {
            if (e.getText().equals("Orders")) {
                Thread.sleep(2000);
                e.click();
                break;
            }
        }*/

        //Ancestor xpath [input[@id='password']//ancestor::div]

        //Child xpath [//div[@class='sub-container']//child::div]

        //following-sibling [//a[@class='linkcolor bold selected']//following-sibling::a]

        //parent [//a[@class='linkcolor bold selected']//parent::div]

        //Descendant [//div[@class='logobar flex maxwrap']//descendant::a]
    }
}
