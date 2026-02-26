package testng.basics;

import org.testng.annotations.Test;

public class CountExample {

    @Test(invocationCount = 10000, invocationTimeOut = 10)
    public void annotation(){
        System.out.println("Test Annotation...");
    }
}
