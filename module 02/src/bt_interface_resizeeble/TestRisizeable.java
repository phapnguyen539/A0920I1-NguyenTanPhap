package bt_interface_resizeeble;


public class TestRisizeable {
    public static void main(String[] args) {
        Resizeable test= new Circle();
        Circle cir= new Circle();
        System.out.println(cir.getArea());
        cir.resize(10);
        System.out.println(cir.getArea());
        System.out.println("----------------------");

        Square square = new Square(8.0);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        square.resize(60);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        System.out.println("----------------------");
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        rectangle.resize(50);
        System.out.println(rectangle.getLength());
        }
        }


