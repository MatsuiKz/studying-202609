package com.matsuikz.patterns.polymorphism;
/**
 * 図形クラス実装
 * 四角形に関する実装クラス
 * SquareImple
 */
public class Square extends AbstractShape {

    // 辺の長さ（縦）
    private double vertical;

    // 辺の長さ（横）
    private double horizontal;

    // コンストラクタ
    public Square(double vertical, double horizontal, String name) {
        super(name);
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    @Override
    public double getArea() {
        return vertical * horizontal;
    }

}
