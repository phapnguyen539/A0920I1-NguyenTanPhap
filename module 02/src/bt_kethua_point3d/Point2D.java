package bt_kethua_point3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    private float[] xy = {2, 2};

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {x, y};
        return arr;
    }

    @Override
    public String toString() {
        return "xy=" + getXY()[0] + ", "+ getXY()[1];

    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        System.out.println(point2D);
    }

}