package session03;

import java.util.Scanner;

public class Bai05 {

    // In kho sach
    public static void printBooks(int[] arr, int n) {
        System.out.print("Kho sach hien tai (" + n + " cuon): [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    // Xoa sach (don trai)
    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Khong tim thay sach ma " + bookId);
            return n;
        }

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Da xoa sach ma " + bookId);
        return n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hoi nguoi dung
        System.out.print("Nhap so luong sach: ");
        int n = sc.nextInt();
        int[] books = new int[n];

        System.out.println("Nhap ma cac cuon sach:");
        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }

        // Vong lap xoa
        while (n > 0) {
            printBooks(books, n);

            System.out.print("Nhap ma sach can xoa (0 de thoat): ");
            int bookId = sc.nextInt();

            if (bookId == 0) {
                break;
            }

            n = deleteBook(books, n, bookId);
        }
    }
}

