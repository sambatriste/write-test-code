package characterization.before;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterizationTest {

    /** とても複雑なクラス */
    static class Discount {
        /**
         * 割引を適用する。
         * （丸め誤差の考慮はしない）
         * @param price お買上げ価格
         * @return 割引適用後価格
         */
        int apply(int price) {
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
    }
}
