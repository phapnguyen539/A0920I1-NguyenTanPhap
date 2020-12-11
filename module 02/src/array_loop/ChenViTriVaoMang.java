package array_loop;

import java.util.Scanner;

public class ChenViTriVaoMang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 5, 6, 7, 8, 9, 0, 0, 0, 0};
        System.out.println("Nhập vào vị trí phần tử muốn chèn:");
        int index = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (index <=0) {
                System.out.println();
            }
        }
    }
}