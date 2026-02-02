package session03;

import java.util.Scanner;

public class Bai01 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] book = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("moi ban nhap ma so thu " + (i + 1) + ":");
            book[i] = sc.nextInt();
        }
        return book;
    }

    public static void displayLibraries(int[] arr) {
        System.out.println("--- KẾT QUẢ---");
        System.out.print("Danh sach ma sach:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print(".");
            } else {
                System.out.print(",");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("moi ban nhap so luong:");
        int n = sc.nextInt();
        int[] arr = addBookToLibraries(n);
        displayLibraries(arr);
    }
}