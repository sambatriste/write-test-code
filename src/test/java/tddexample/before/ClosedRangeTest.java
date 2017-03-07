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
}
