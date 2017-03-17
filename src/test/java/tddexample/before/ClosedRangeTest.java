package tddexample.before;

import static org.junit.Assert.*;

import org.junit.Test;


public class ClosedRangeTest {

    static class ClosedRange {

        /**
         * コンストラクタ。
         * @param lower 下端点
         * @param upper 上端点
         */
        ClosedRange(int lower, int upper) {
        }
    }

    @Test
    public void 下端点と上端点を指定してnewできる() {
        ClosedRange c3to8 = new ClosedRange(3, 8);
        assertNotNull(c3to8);
    }

    @Test
    public void 下端点を取得できる() {
        fail("まだ実装されていません。");
        // [3,8] の下端点は 3
    }

    @Test
    public void 上端点を取得できる() {
        fail("まだ実装されていません。");
        // [3,8] の上端点は 8
    }


    @Test
    public void 文字列表現を取得できる() {
        fail("まだ実装されていません。");
        //  [3,8] の文字列表記は "[3,8]"
    }

    @Test
    public void 上端点と下端点が逆転しているとき例外が発生する() {
        fail("まだ実装されていません。");
        // [8,3]はエラー
    }


    @Test
    public void 閉区間が指定した整数を含むときtrueが返却される() {
        fail("まだ実装されていません。");
        // [3,8] は 5 を含む
    }


    @Test
    public void 閉区間が指定した整数を含まないときfalseが返却される() {
        fail("まだ実装されていません。");
        // [3,8] は -1 を含まない
    }


    @Test
    public void ふたつの閉区間が等しいときtrueが返却される() {
        fail("まだ実装されていません。");
        // [3,8] は [3,8] と等しい
    }


    @Test
    public void ふたつの閉区間が等しくないときfalseが返却される() {
        fail("まだ実装されていません。");
        // [3,8]と[1,6]は等しくない。
    }

}
