package tddexample.before;

/** 閉区間を表すクラス。 */
public class ClosedRange {

    /** 下端点 */
    private int lowerEndPoint;

    /** 上端点 */
    private int upperEndPoint;

    /**
     * コンストラクタ。
     * @param lower 下端点
     * @param upper 上端点
     */
    public ClosedRange(int lower, int upper) {
        this.lowerEndPoint = lower;
        this.upperEndPoint = upper;
    }

    /**
     * 下端点を取得する。
     * @return 下端点
     */
    public int getLowerEndPoint() {
        return lowerEndPoint;
    }

    /**
     * 上端点を取得する。
     * @return 上端点
     */
    public int getUpperEndPoint() {
        return upperEndPoint;
    }

}
