package testng.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = "smoke")
    public void verifyPayment(){
        Assert.assertTrue(false);
        System.out.println("StudentPayment");
    }

    @Test(groups = "smoke")
    public void check(){
        Assert.assertTrue(true);
        System.out.println("check");
    }

    @Test(dependsOnGroups = "smoke")
    public void verifyPaymentOTP(){
        System.out.println("Home Dashboard");
    }

    @Test
    public void verifyOnboarding(){
        System.out.println("Home Onboarding");
    }
}
