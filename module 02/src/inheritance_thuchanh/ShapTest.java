package inheritance_thuchanh;

public class ShapTest {
    public static void main(String[] args) {
        Shape shap= new Shape();
        System.out.println(shap);
        shap = new Shape("yellow",true);
        System.out.println(shap);
    }
}
