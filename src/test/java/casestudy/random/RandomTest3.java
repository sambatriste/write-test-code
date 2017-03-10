package casestudy.random;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import org.junit.Test;

/**
 * Created by tie301686 on 2017/03/09.
 */
public class RandomTest3 {

    @Test
    public void test() {

        Iterator<Integer> itr = Arrays.asList(0x31, 0x32, 0x33, 0x34, 0x35).iterator();

        PasswordGenerator3 sut = new PasswordGenerator3(itr);

        // 乱数ではなくテストで与えた数値が使われるので、結果が予測できる。
        assertEquals("12345", sut.generate(5));
    }

}
