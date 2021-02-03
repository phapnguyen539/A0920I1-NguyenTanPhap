package stop_whatch;
import java.util.Arrays;
import java.util.Date;

import static java.lang.Math.floor;
import static java.lang.StrictMath.random;

public class StopWhatch {
    private Date startTime;
    private Date endTime;


    public void start() {
        startTime = new Date();
    }


    public void stop() {
        endTime = new Date();
    }


    public float getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }


    public static void main(String[] args) {
        StopWhatch stopWatch = new StopWhatch();
        double[] arr1 = new double[500000];
        // create arr 100000 random
        for (int i = 0; i < 500000; i++) {
            arr1[i] = floor(random() * 100) + 1;
        }

        System.out.println("Array before sort_Mảng trước khi sắp xếp:");
        System.out.println(Arrays.toString(arr1));
        stopWatch.start();
        Arrays.sort(arr1);
        stopWatch.stop();
        System.out.println("Array after sort_Mảng sau khi sắp xếp:");
        System.out.println(Arrays.toString(arr1));
        System.out.printf("Elapsed Time: %.2f ms.", stopWatch.getElapsedTime());

    }
}
