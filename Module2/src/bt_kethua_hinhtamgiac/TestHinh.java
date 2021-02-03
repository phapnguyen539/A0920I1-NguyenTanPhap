package bt_kethua_hinhtamgiac;
import java.util.Scanner;

public class TestHinh {
    public static void main(String[] args) {
    //    Shape shape = new Shape(4, 5, 6);
     //   System.out.println(shape);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào side1:");
        double size1 = scanner.nextDouble();
        System.out.println("Mời nhập vào side2:");
        double size2 = scanner.nextDouble();
        System.out.println("Mời nhập vào side3:");
        double size3 = scanner.nextDouble();
        System.out.println("Mời nhập màu sắc:");
        String color = scanner.next();

        Triangle triangle = new Triangle(size1,size2,size3,color);
        System.out.println(triangle);
    }
}
