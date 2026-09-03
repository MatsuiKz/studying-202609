abstract class AbstractShape {
    // 計算名称
    private String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // 面積
    public abstract double getArea();
}
