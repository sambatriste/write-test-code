package helloworld;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MyFirstTest {

    // テストメソッドです。
    // メソッドに'@Test'アノテーションを付与することで、テストメソッドとして認識されます
    @Test
    public void 指定した要素のインデックスを取得できること() {
        // 準備
        // テストの事前条件を整えます
        // 0:東京, 1:大阪, 2:名古屋
        List<String> cities = Arrays.asList("東京", "大阪", "名古屋");

        // 実行
        // テスト対象の処理を呼び出します
        int indexOfOsaka = cities.indexOf("大阪");

        // 結果比較
        // 実行結果が期待通りであることを確認します
        assertEquals(1, indexOfOsaka);
    }
}

