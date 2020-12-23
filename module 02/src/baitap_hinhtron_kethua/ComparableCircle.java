package baitap_hinhtron_kethua;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    public ComparableCircle(boolean filled, double radius, String color) {
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}