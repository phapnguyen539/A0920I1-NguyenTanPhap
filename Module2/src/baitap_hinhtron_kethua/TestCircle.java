package baitap_hinhtron_kethua;

import java.util.Arrays;
import java.util.Collections;

public class TestCircle {
    public static void main(String[] args) {
        ComparableCircle[] compa= new ComparableCircle[3];
        compa[0]= new ComparableCircle();
        compa[1]= new ComparableCircle(3.6, "red");
        compa[2]=new ComparableCircle(true,3.5,"yellow");
        System.out.println("Pre-sorted");
        for (ComparableCircle circle : compa
             ) {
            System.out.println(circle);
        }
        Arrays.sort(compa);
        System.out.println("After- sorted");
        for (ComparableCircle circle: compa
             ) {
            System.out.println(circle);

        }
    }
}
