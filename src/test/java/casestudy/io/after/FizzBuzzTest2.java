package casestudy.io.after;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

/**
 * Created by tie301686 on 2017/03/10.
 */
public class FizzBuzzTest2 {

    private StringWriter writer = new StringWriter();
    private FizzBuzz fizzBuzz = new FizzBuzz(writer);

    @Test
    public void 入力が3のときFizzが返却されること() {
        assertEquals("Fizz", fizzBuzz.evaluate(3));
    }

    @Test
    public void 入力が4のとき4が返却されること() {
        assertEquals("4", fizzBuzz.evaluate(4));
    }

    @Test
    public void 入力が5のときBuzzが返却されること() {
        assertEquals("Buzz", fizzBuzz.evaluate(5));
    }


}