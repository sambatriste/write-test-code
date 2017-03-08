package characterization.after;

/** とても複雑なクラス */
class Discount {
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
