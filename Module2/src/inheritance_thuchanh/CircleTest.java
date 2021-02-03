package inheritance_thuchanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle= new Circle();
        System.out.println(circle);
        circle= new Circle(3.5);
        System.out.println(circle);
        circle= new Circle("green",false,3.5);
        System.out.println(circle);
    }
}
