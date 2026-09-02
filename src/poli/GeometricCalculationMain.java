import java.util.List;

/**
 * 図形計算の実行クラス
 * GeometricCalculationMain
 */
public class GeometricCalculationMain {
    public static void main(String[] args) {
        // Shape型なのでListで受けられる
        List<Shape> shapes = List.of(new CircleImpl(5.0), new TriangleImpl(1, 2), new SquareImpl(2, 3));

        // 合計値を出す場合（当初要件ではないが）
        double total = 0;
        for (Shape shape: shapes) {
            total += shape.getArea();
        }
        
        System.out.println(total);
    }

    /**
     * 円の面積を計算する
     * 
     * @param radius
     */
    private static void calcCircleArea(double radius) {
        // 円の面積
        Shape circle = new CircleImpl(radius);
        double area = circle.getArea();
        System.out.println("円の面積: " + area);
    }

    /**
     * 三角形の面積を計算する
     * 
     * @param bottom
     * @param height
     */
    private static void calcTriangleArea(double bottom, double height) {
        // 三角形の面積
        TriangleImpl triangle = new TriangleImpl(bottom, height);
        double area = triangle.getArea();
        System.out.println("三角形の面積: " + area);
    }

    /**
     * 四角形の面積を計算する
     * 
     * @param vertical
     * @param horizontal
     */
    private static void calcSquareArea(double vertical, double horizontal) {
        // 四角形の面積
        SquareImpl square = new SquareImpl(vertical, horizontal);
        double area = square.getArea();
        System.out.println("四角形の面積: " + area);
    }
}
