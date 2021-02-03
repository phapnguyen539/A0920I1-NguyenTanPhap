package sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestInt {
    public static void main(String[] args) {
        List<SortInt> sortIntList=new ArrayList<>();
        sortIntList.add(new SortInt(2,"C"));
        sortIntList.add(new SortInt(4,"B"));
        sortIntList.add(new SortInt(3,"D"));
        sortIntList.add(new SortInt(1,"A"));
        for (SortInt sortint : sortIntList  ) {
            System.out.println(sortint);
        }
        Collections.sort(sortIntList);
        System.out.println("----");
        for (SortInt sortint: sortIntList){
            System.out.println(sortint);
        }

    }
}
