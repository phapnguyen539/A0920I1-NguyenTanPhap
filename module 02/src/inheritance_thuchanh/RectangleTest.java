package inheritance_thuchanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        rectangle=new Rectangle(2.5,4.6);
        System.out.println(rectangle);
        rectangle=new Rectangle("origin",true,2.3,5.8);
        System.out.println(rectangle);
    }
}
