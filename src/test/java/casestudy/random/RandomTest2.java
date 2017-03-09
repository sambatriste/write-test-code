package casestudy.random;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import org.junit.Test;


public class RandomTest2 {



    @Test
    public void test() {
        // パスワード生成の元となる数値を準備
        Iterator<Integer> itr = Arrays.asList(0x30, 0x31, 0x32, 0x33, 0x34)
                                      .iterator();

        // 数値を生成する箇所を置き換え
        PasswordGenerator2 sut = new PasswordGenerator2() {
            @Override
            protected int generateInt() {
                return itr.next();
            }
        };

        // 乱数ではなくテストで与えた数値が使われるので、結果が予測できる。
        assertEquals("01234", sut.generate(5));
    }
}
