package testng.failscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoOfFailScript {

   @Test
    public void checkT1(){
        Assert.assertTrue(false);
    }

   @Test
    public void checkT2(){
        Assert.assertTrue(true);
        System.out.println("Check T2");
    }

   @Test
    public void checkT3(){
        Assert.assertTrue(false);
    }

   @Test
    public void checkT4(){
        Assert.assertTrue(true);
        System.out.println("Check T4");
    }

   @Test
    public void checkT5(){
        Assert.assertTrue(true);
        System.out.println("Check T5");
    }

}
