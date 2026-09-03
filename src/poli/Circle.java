/**
 * 図形クラス実装
 * 円に関する実装クラス
 * CircleImple
 */
public class Circle extends AbstractShape {

    // 半径
    private double radius;

    // コンストラクタ
    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
