package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetAllOptionsFromDropDown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.navigate().to("https://www.letskodeit.com/practice");

        WebElement dropDown = driver.findElement(By.id("carselect"));
        Select s = new Select(dropDown);
        List<WebElement> allElements = s.getOptions();
        for (WebElement e : allElements){
            System.out.println(e.getText());
        }

        driver.close();
    }
}
