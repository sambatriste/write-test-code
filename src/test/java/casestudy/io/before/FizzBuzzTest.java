package casestudy.io.before;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void test() {
        FizzBuzz.main();
        // 標準出力に表示されるだけなのでassertできない
        // 実行は自動化できたが、結果確認が自動化できていない
    }
}
