package testng.basics;

import org.testng.annotations.*;

public class TestNGHierachy {

    @AfterMethod
    public void post(){
        System.out.println("After Method...");
    }

    @BeforeMethod
    public void pre(){
        System.out.println("Before Method...");
    }

    @BeforeClass
    public void bfc(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afc(){
        System.out.println("After Class");
    }

    @BeforeTest
    public void bft(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void aft(){
        System.out.println("After Test");
    }

    @Test
    public void t1(){
        System.out.println("t1");
    }

    @Test
    public void t2(){
        System.out.println("t2");
    }
    @BeforeSuite
    public void bfs(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afs(){
        System.out.println("After Suite");
    }

}
