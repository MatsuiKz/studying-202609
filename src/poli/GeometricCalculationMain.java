
/**
 * 図形計算の実行クラス
 * GeometricCalculationMain
 */
public class GeometricCalculationMain {
    public static void main(String[] args) {
        // 円の面積
        calcCircleArea(5.0);

        // 三角形の面積
        calcTriangleArea(1, 2);

        // 四角形の面積
        calcSquareArea(3, 4);
    }

    /**
     * 円の面積を計算する
     * 
     * @param radius
     */
    private static void calcCircleArea(double radius) {
        // 円の面積
        CircleImple circle = new CircleImple(radius);
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
        TriangleImple triangle = new TriangleImple(bottom, height);
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
        SquareImple square = new SquareImple(vertical, horizontal);
        double area = square.getArea();
        System.out.println("四角形の面積: " + area);
    }
}
