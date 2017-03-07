package characterization.after;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CharacterizationTest {

    /** テスト対象クラス */
    static class Discount {
        /**
         * 割引を適用する。
         * @param price お買上げ価格
         * @return 割引適用後価格
         */
        int apply(int price) {
            if (price < 0) {
                throw new IllegalArgumentException("価格は負数であってはいけません。");
            }
            if (price < 1000) {
                return price;
            }
            if (price < 10000) {
                return (int) (price * 0.9);
            }
            return (int) (price * 0.8);
        }
    }

    @Test
    public void 仕様化テスト() {
        Discount discount = new Discount();
        assertEquals(0, discount.apply(0));
        assertEquals(100, discount.apply(100));
        assertEquals(900, discount.apply(1000));
        assertEquals(4500, discount.apply(5000));
        assertEquals(8000, discount.apply(10000));
        assertEquals(80000, discount.apply(100000));
    }

    @Test
    public void 価格が負数のとき例外が発生すること() {
        Discount discount = new Discount();
        try {
            int ret = discount.apply(-1);
            fail("期待した例外が発生しませんでした。[" + ret + "]");
        } catch (IllegalArgumentException e) {
            // OK
        }
    }
}
