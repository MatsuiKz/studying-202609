import java.util.List;

/**
 * 図形計算の実行クラス
 * GeometricCalculationMain
 */
public class GeometricCalculationMain {
    public static void main(String[] args) {

        // Shape型なのでListで受けられる
        List<Shape> shapes = List.of(
                new CircleImpl(5.0), new TriangleImpl(1, 2), new SquareImpl(2, 3));

        areaSum(shapes);
        areaIndividual(shapes);

    }

    private static void areaSum(List<Shape> shapes) {

        // 合計値を出す場合（当初要件ではないが）
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }

        System.out.println(total);
    }

    private static void areaIndividual(List<Shape> shapes) {

        for (Shape shape : shapes) {
            if (shape instanceof CircleImpl) {
                System.out.println("円の面積：" + String.valueOf(shape.getArea()));
            }
            if (shape instanceof TriangleImpl) {
                System.out.println("三角形の面積：" + String.valueOf(shape.getArea()));
            }
            if (shape instanceof SquareImpl) {
                System.out.println("四角形の面積：" + String.valueOf(shape.getArea()));
            }
        }
    }
}
