package bt_kethua_point3d;

public class Point3D extends Point2D {
    private float z=0.0f;
    public Point3D(){

    }
    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setZ(){
        this.z=z;
    }
    public void setXYZ(float x, float y,float z){
        setX(x);
        setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] arr1= {super.getX(),super.getY(),z};
        return arr1;
    }

    @Override
    public String toString() {
        return "z="+getZ()+ super.toString();
    }


    }

