package session03;

public class Bai04 {
    public static int[] sortBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void displayBooks(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) break;
            System.out.print(",");
        }
        System.out.printf("]\n");
    }

    public static void main(String[] args) {
        int[] arr = {105, 102, 109, 101, 103};
        System.out.print("Truoc khi sap xep:");
        displayBooks(arr);
        arr = sortBooks(arr);
        System.out.print("sau khi sap xep:");
        displayBooks(arr);
    }
}