/**
 * 
 * Execute
 */
public class Execute {
    public static void main(String[] args) {
        // 円の面積
        calcCircleArea(5.0);
    }

    /**
     * 円の面積を計算する
     * @param radius
     */
    private static void calcCircleArea(double radius) {
        // 円の面積
        CircleImple circle = new CircleImple(radius);
        double area = circle.getArea();
        System.out.println("円の面積: " + area);
    }
}
