package casestudy;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tie301686 on 2017/03/09.
 */
public class SystemClockTest {

    public static class Greeter {

        public String greet() {
            Date current = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

            return dateFormat.format(current);
        }

    }

    @Test
    public void test() {
        Greeter greeter = new Greeter();
        System.out.println("greeter.greet() = " + greeter.greet());
    }
}
