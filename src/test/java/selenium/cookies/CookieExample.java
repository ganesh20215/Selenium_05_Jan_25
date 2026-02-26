package selenium.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class CookieExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();  //Upcasting in Java
        driver.navigate().to("https://www.tcs.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Add cookie
        Cookie ck = new Cookie("company", "Edso Services");
        driver.manage().addCookie(ck);

        //get specific cookie
        //System.out.println(driver.manage().getCookieNamed("company"));

        //get all cookies
        System.out.println("*************************** Before delete any cookie **************");
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies){
            System.out.println(c);
        }
        System.out.println();
        System.out.println();

        //driver.manage().deleteCookieNamed("company");
        driver.manage().deleteAllCookies();
        Set<Cookie> allCookies2 = driver.manage().getCookies();
        for (Cookie c : allCookies2){
            System.out.println(c);
        }

        driver.close();
    }
}
