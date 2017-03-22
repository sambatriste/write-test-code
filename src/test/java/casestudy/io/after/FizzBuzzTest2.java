package casestudy.io.after;

import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

/** メインロジックのみテスト */
public class FizzBuzzTest2 {

    @Test
    public void 入力が3のときFizzが返却されること() {
        assertEquals("Fizz", FizzBuzz.evaluate(3));
    }

    @Test
    public void 入力が4のとき4が返却されること() {
        assertEquals("4", FizzBuzz.evaluate(4));
    }

    @Test
    public void 入力が5のときBuzzが返却されること() {
        assertEquals("Buzz", FizzBuzz.evaluate(5));
    }

    @Test
    public void 入力が15のときFizzBuzzが返却されること() {
        assertEquals("FizzBuzz", FizzBuzz.evaluate(15));
    }

}