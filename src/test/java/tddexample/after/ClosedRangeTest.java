package tddexample.after;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;


public class ClosedRangeTest {


    @Test
    public void 下端点と上端点を指定してnewできる() {
        ClosedRange c3to8 = new ClosedRangeTest.ClosedRange(3, 8);
        assertNotNull(c3to8);
    }

    @Test
    public void 下端点を取得できる() {

        // [3,8] を生成
        ClosedRange c3to8 = new ClosedRange(3, 8);
        // [3,8] の下端点は 3
        assertEquals(3, c3to8.getLowerEndpoint());
    }

    @Test
    public void 上端点を取得できる() {

        ClosedRange c3to8 = new ClosedRange(3, 8);

        assertEquals(8, c3to8.getUpperEndPoint());
    }

    //  [3,8] の文字列表記は "[3,8]"
    @Test
    public void 文字列表現を取得できる() {
        ClosedRange c3to8 = new ClosedRange(3, 8);
        assertEquals("[3,8]", c3to8.toString());
    }

    @Test
    public void 上端点と下端点が逆転している場合_例外が発生する() {
        try {
            ClosedRange c8to3 = new ClosedRange(8, 3); // => エラー
            fail("例外が発生するはずです！");
        } catch (IllegalArgumentException e) {
            return; // 期待した例外が発生した
        }
    }

    // [3,8] は 5 を含む
    @Test
    public void 閉区間が指定した整数を含む場合_trueを返却() {
        ClosedRange c3to8 = new ClosedRange(3, 8);
        assertEquals(true, c3to8.contains(5));
    }

    // [3,8] は -1 を含まない
    @Test
    public void 閉区間が指定した整数を含まない場合_falseを返却() {
        ClosedRange c3to8 = new ClosedRange(3, 8);
        assertEquals(false, c3to8.contains(-1));
    }

    // [3,8] は [3,8] と等しい
    @Test
    public void ふたつの閉区間が等しい場合_trueを返却() {
        ClosedRange c3to8 = new ClosedRange(3, 8);
        assertEquals(true, c3to8.equals(new ClosedRange(3, 8)));
    }


    @Test
    public void ふたつの閉区間が等しくない場合_falseを返却() {
        ClosedRange c3to8 = new ClosedRange(3, 8);
        ClosedRange c1to6 = new ClosedRange(1, 6);
        assertEquals(false, c3to8.equals(c1to6)); // => false
    }


    static class ClosedRange {
        /** 下端点 */
        private int lower;
        /** 上端点 */
        private int upper;

        /**
         * コンストラクタ。
         * @param lower 下端点
         * @param upper 上端点
         */
        ClosedRange(int lower, int upper) {
            this.lower = lower;
            this.upper = upper;
            if (lower > upper) {
                String message = "上端点と下端点が逆転しています。lower=[" + lower + "], upper=[" + upper + "]";
                throw new IllegalArgumentException(message);
            }
        }

        /**
         * 下端点を取得する。
         * @return 下端点
         */
        int getLowerEndpoint() {
            return lower;
        }

        /**
         * 上端点を取得する。
         * @return 上端点
         */
        int getUpperEndPoint() {
            return upper;
        }

        /** {@inheritDoc} */
        @Override
        public String toString() {
            return "[" + lower + "," + upper + "]";
        }

        /**
         * 指定された数値が、この閉域に含まれるかどうか判定する。
         * @param number 判定対象となる数値
         * @return 含まれる場合、真
         */
        boolean contains(int number) {
            return lower <= number && number <= upper;
        }

        /** {@inheritDoc} */
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof ClosedRange)) {
                return false;
            }
            ClosedRange another = (ClosedRange) obj;
            return another.lower == this.lower && another.upper == this.upper;
        }
    }
}
