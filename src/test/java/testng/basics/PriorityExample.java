package testng.basics;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 'A', enabled = false)
    public void caseZ(){
        System.out.println("Case Z");
    }

    @Test(priority = 70)
    public void caseM(){
        System.out.println("Case M");
    }

    @Test(priority = 2)
    public void caseB(){
        System.out.println("Case B");
    }

    @Test(priority = 5)
    public void caseO(){
        System.out.println("Case O");
    }

    @Test(priority = -5)
    public void caseG(){
        System.out.println("Case G");
    }
}
