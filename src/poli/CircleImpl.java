
/**
 * 図形クラス実装
 * 円に関する実装クラス
 * CircleImple
 */
public class CircleImpl implements Shape{

    // 半径
    private double radius;

    // コンストラクタ
    public CircleImpl(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
