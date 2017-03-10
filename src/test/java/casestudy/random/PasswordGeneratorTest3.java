package casestudy.random;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import static org.junit.Assert.*;

public class PasswordGeneratorTest3 {

    @Test
    public void test() {
        // パスワード生成の元となる数値を準備
        Iterator<Integer> itr = Arrays.asList(0x31, 0x32, 0x33, 0x34, 0x35)
                                      .iterator();
        // Randomクラスをモック化
        Random mock = new Random() {
            @Override
            public int nextInt() {
                return itr.next();
            }
        };
        PasswordGenerator3 sut = new PasswordGenerator3(mock);

        // 乱数ではなくテストで与えた数値が使われるので、結果が予測できる。
        assertEquals("12345", sut.generate(5));
    }

    /** 別解 */
    @Test
    public void test2() {
        Random seedZero = new Random(0L);
        PasswordGenerator3 sut = new PasswordGenerator3(seedZero);

        // 乱数ではなくテストで与えた数値が使われるので、結果が予測できる。
        assertEquals("Gf[@Q", sut.generate(5));
    }

}