package array_loop;

import java.util.Scanner;

public class XoaPhantuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {10, 4, 7, 8, 6, 5};
        System.out.println("nhap vao vi tri muon xoa");
        int index = scanner.nextInt();
        for (int i = index; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length-1]=0;
        System.out.println("Phần tử sau khi bị xóa:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
