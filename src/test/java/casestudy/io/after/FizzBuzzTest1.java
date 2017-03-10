package casestudy.io.after;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

/**
 * Created by tie301686 on 2017/03/10.
 */
public class FizzBuzzTest1 {



    @Test
    public void Writerを差し替えたテスト() throws IOException {
        StringWriter writer = new StringWriter();
        FizzBuzz fizzBuzz = new FizzBuzz(writer);
        fizzBuzz.print(10);
        String actual = writer.toString();
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n", actual);
    }

}