
/**
 * 図形クラス実装
 * 四角形に関する実装クラス
 * SquareImple
 */
public class SquareImpl implements Shape {

    // 辺の長さ（縦）
    private double vertical;

    // 辺の長さ（横）
    private double horizontal;

    // コンストラクタ
    public SquareImpl(double vertical, double horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    @Override
    public double getArea() {
        return vertical * horizontal;
    }
}
