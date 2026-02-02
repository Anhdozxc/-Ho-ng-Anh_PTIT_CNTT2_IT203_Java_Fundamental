package session03;

import java.util.Scanner;

public class Bai02 {
    public static int searchBooks(String[] arr, int i, String search) {
        if (i == arr.length) return -1;
        if (arr[i].equals(search)) return i;
        return searchBooks(arr, i + 1, search);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {
                "Java Programming",
                "Clean Code",
                "Effective Java",
                "Head First Java",
                "Data Structures and Algorithms"
        };
        System.out.print("Moi ban nhap ten can tim:");
        String search = sc.nextLine();
        int pos = searchBooks(books, 0, search);
        if (pos != -1) {
            System.out.printf("Tim thay sach %s tai vi tri %d", search, pos);
        } else {
            System.out.println("sach khong ton tai trong thu vien");
        }
    }
}