package casestudy.io.after;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

/** 標準出力ではなくメモリに出力してテスト */
public class FizzBuzzTest1 {

    @Test
    public void Writerを差し替えたテスト() throws IOException {
        // メモリに保持するWriter
        StringWriter writer = new StringWriter();
        FizzBuzz fizzBuzz = new FizzBuzz(writer);

        fizzBuzz.print(10);

        // 結果確認
        String expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n";
        String actual = writer.toString();  // メモリから値取り出し
        assertEquals(expected, actual);
    }

}