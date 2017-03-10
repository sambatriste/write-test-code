package casestudy.random;

import org.junit.Test;

public class PasswordGeneratorTest1 {

    @Test
    public void test() {
        PasswordGenerator1 sut = new PasswordGenerator1();
        // 何が返却されるかわからないのでassertできない
        System.out.println(sut.generate(5));
    }
}
