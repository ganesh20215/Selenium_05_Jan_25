package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstProgram {

    public static void main(String[] args) {

        //WebDriver : Interface
        //driver : instance variable
        //new : Object
        //ChromeDriver() : Child Class/constuctor

        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();

        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.get("https://www.edso.in/");
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        driver.close();
    }
}
