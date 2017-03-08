package characterization.after;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CharacterizationTest {

    @Test
    public void 仕様化テスト() {
        characterization.after.Discount discount = new characterization.after.Discount();
        assertEquals(0, discount.apply(0));
        assertEquals(100, discount.apply(100));
        assertEquals(900, discount.apply(1000));
        assertEquals(4500, discount.apply(5000));
        assertEquals(8000, discount.apply(10000));
        assertEquals(80000, discount.apply(100000));
    }

    @Test
    public void 価格が負数のとき例外が発生すること() {
        characterization.after.Discount discount = new characterization.after.Discount();
        try {
            int ret = discount.apply(-1);
            fail("期待した例外が発生しませんでした。[" + ret + "]");
        } catch (IllegalArgumentException e) {
            // OK
        }
    }
}
