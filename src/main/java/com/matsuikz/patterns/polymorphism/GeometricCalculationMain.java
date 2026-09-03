package com.matsuikz.patterns.polymorphism;
import java.util.List;

/**
 * 図形計算の実行クラス
 * GeometricCalculationMain
 */
public class GeometricCalculationMain {
    public static void main(String[] args) {

        // Shape型なのでListで受けられる
        List<AbstractShape> shapes = List.of(
                new Circle(5.0, "円"), new Triangle(1, 2, "三角形"), new Square(2, 3, "四角形"));

        areaSum(shapes);
        areaIndividual(shapes);

    }

    private static void areaSum(List<AbstractShape> shapes) {

        // 合計値を出す場合（当初要件ではないが）
        double total = 0;
        for (AbstractShape shape : shapes) {
            total += shape.getArea();
        }

        System.out.println("面積の合計：" + total);
    }

    private static void areaIndividual(List<AbstractShape> shapes) {

        for (AbstractShape shape : shapes) {
            System.out.println(shape.getName() + "の面積：" + shape.getArea());
        }

    }
}
