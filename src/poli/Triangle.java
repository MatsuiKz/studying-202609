/**
 * 図形クラス実装
 * 三角形に関する実装クラス
 * TriangleImple
 */
public class Triangle extends AbstractShape {

    // 底辺
    private double bottom;

    // 高さ
    private double height;

    // コンストラクタ
    public Triangle(double bottom, double height, String name) {
        super(name);
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * bottom * height;
    }
}
