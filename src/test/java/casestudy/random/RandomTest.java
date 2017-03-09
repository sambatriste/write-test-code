package casestudy.random;

import java.util.Random;

import org.junit.Test;

/**
 * Created by tie301686 on 2017/03/09.
 */
public class RandomTest {

    @Test
    public void test() {
        PasswordGenerator1 sut = new PasswordGenerator1();
        // 何が返却されるかわからないのでassertできない
        System.out.println(sut.generate(5));
    }
}
