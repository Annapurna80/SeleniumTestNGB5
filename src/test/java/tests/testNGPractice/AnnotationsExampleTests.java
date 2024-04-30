package tests.testNGPractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsExampleTests {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Setting up the suite environment");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Configuring test environment");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Loading class resources");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Initializing test method setup");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        int a = 3;
        int b = 4;
        int sum = a+b;
        Assert.assertEquals(sum, 7, "Sum 5 and 7 should be 7");
    }
    @Test
    public void test3(){
        int a=3;
        int b = 4;
        Assert.assertTrue(b>a, "b should be greater then a");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Cleaning up after test method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Releasing class resources");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Tearing down test environment");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Cleaning up the suite environment");
    }

}
