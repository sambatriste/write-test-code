package casestudy.random;

import casestudy.random.PasswordGenerator4.NumberGenerator;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class PasswordGeneratorTest4 {

    static class NumberGeneratorMock implements NumberGenerator {

        private final Iterator<Integer> itr;

        /** コンストラクタ */
        NumberGeneratorMock(Integer... numbers) {
            this.itr = Arrays.asList(numbers).iterator();
        }

        @Override
        public int next() {
            return itr.next();
        }
    }

    @Test
    public void test() {

        NumberGeneratorMock mock = new NumberGeneratorMock(0x31, 0x32, 0x33, 0x34, 0x35);
        PasswordGenerator4 sut = new PasswordGenerator4(mock);

        // 乱数ではなくテストで与えた数値が使われるので、結果が予測できる。
        assertEquals("12345", sut.generate(5));
    }
}
