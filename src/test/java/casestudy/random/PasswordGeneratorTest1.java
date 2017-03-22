package casestudy.random;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordGeneratorTest1 {

    @Test
    public void test() {
        PasswordGenerator1 sut = new PasswordGenerator1();
        // 何が返却されるかわからないので、assertすると失敗する
        assertEquals("XXXXX", sut.generate(5));
    }
}
