package casestudy.random;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class PasswordGeneratorTest2 {

    @Test
    public void test() {
        // パスワード生成の元となる数値を準備
        Iterator<Integer> itr = Arrays.asList(0x31, 0x32, 0x33, 0x34, 0x35)
                                      .iterator();
        // 数値を生成する箇所を置き換え
        PasswordGenerator2 sut = new PasswordGenerator2() {
            @Override
            protected int generateInt() {
                return itr.next();
            }
        };

        // 乱数ではなくテストで与えた数値が使われるので、結果が予測できる。
        assertEquals("12345", sut.generate(5));
    }
}
