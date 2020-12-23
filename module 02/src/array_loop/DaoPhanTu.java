package array_loop;

import java.util.Scanner;

public class DaoPhanTu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.print("Nhập kích thước vào mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước phải nhỏ 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử cho mảng: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("Mảng đã nhập là: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        // In ra mảng sau khi đã đảo ngược

        System.out.printf("Mảng sau khi đã đảo ngược là: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
