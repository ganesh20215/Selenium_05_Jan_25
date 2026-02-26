package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Login");
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomeDashboard(){
        System.out.println("Home Dashboard");
    }

    @Test
    public void verifyOnboarding(){
        System.out.println("Home Onboarding");
    }
}
