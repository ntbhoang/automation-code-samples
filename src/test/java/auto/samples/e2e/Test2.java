package auto.samples.e2e;

import com.google.common.util.concurrent.Uninterruptibles;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test2 {

   @Test
    public void test1(){
       System.out.println("Test 1");
       Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
   }

    @Test
    public void test2(){
        System.out.println("Test 2");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
    }

    @Test
    public void test3(){
        System.out.println("Test 3");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
    }
}
