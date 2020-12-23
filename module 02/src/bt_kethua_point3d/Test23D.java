package bt_kethua_point3d;

public class Test23D {
    public static void main(String[] args) {
        Point2D point2D= new Point2D(2.5f,4.6f);
        System.out.println(point2D);
        Point3D point3D=new Point3D(6.7f,5.6f,4.5f);
        System.out.println(point3D);
        for (int i = 0; i < point3D.getXYZ().length; i++) {
            System.out.println(point3D.getXYZ()[i]);

        }
    }
}
