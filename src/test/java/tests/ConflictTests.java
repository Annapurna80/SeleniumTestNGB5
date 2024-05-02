package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConflictTests {
    @Test
    public void test(){
        int a = 5;
        int b = 5;
        System.out.println("Sum" + (a+b));

    }
    @Test
    public void test2(){

        String message = "Welcome to USA, ladies and gentelmens!!!";
        System.out.println(message);;

     

    }
}
