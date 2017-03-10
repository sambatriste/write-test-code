package casestudy.random;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by tie301686 on 2017/03/10.
 */
public class RandomTest4 {

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

        PasswordGenerator4 sut = new PasswordGenerator4(mock);

        // 乱数ではなくテストで与えた数値が使われるので、結果が予測できる。
        assertEquals("12345", sut.generate(5));
    }

}