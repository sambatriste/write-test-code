package casestudy.io.after;

import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

/** メインロジックのみテスト */
public class FizzBuzzTest2 {

    @Test
    public void 入力が3のときFizzが返却されること() {
        String expected = "Fizz";
        String actual = FizzBuzz.evaluate(3);
        assertEquals(expected, actual);
    }

    @Test
    public void 入力が4のとき4が返却されること() {
        String expected = "4";
        String actual = FizzBuzz.evaluate(4);
        assertEquals(expected, actual);
    }

    @Test
    public void 入力が5のときBuzzが返却されること() {
        String expected = "Buzz";
        String actual = FizzBuzz.evaluate(5);
        assertEquals(expected, actual);
    }

    @Test
    public void 入力が15のときFizzBuzzが返却されること() {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.evaluate(15);
        assertEquals(expected, actual);
    }

}