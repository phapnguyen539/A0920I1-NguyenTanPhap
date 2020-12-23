package inheritance_thuchanh;

public class SquareTest {
    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square);
        square=new Square(3.5);
        System.out.println(square);
        square=new Square("white",false,4.5);
        System.out.println(square);
    }
}
