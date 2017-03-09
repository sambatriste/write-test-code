package casestudy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.fail;

public class ExceptionTest {

    @Test
    public void 例外が発生するテストをどう書くか() {
        List<String> cities = Arrays.asList("東京", "大阪", "名古屋");

        // 例外が出るはずだが、どうやってテストを書くか？
        cities.get(3);
    }

    @Test
    public void 存在しないインデックスを指定したとき例外が発生すること() {
        List<String> cities = Arrays.asList("東京", "大阪", "名古屋");
        try {
            cities.get(3);

            // 例外が発生するはずので、この文には到達しないはず
            fail("期待した例外が発生しませんでした。");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 例外発生時はここにジャンプ
            return;
        }
    }
}
