package casestudy.random;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class PasswordGeneratorTest4 {
    @Test
    public void test() {
        Iterator<Integer> itr = Arrays.asList(0x31, 0x32, 0x33, 0x34, 0x35)
                                      .iterator();
        PasswordGenerator4 sut = new PasswordGenerator4(itr);

        // 乱数ではなくテストで与えた数値が使われるので、結果が予測できる。
        assertEquals("12345", sut.generate(5));
    }
}
