package session01;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String bookID = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String bookName = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhap gia bia: ");
        double price = sc.nextDouble();

        System.out.print("Sach con trong kho (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        // Tinh tuoi tho sach
        int age = 2026 - publishYear;

        // Xu ly du lieu
        String bookNameUpper = bookName.toUpperCase();
        String status;
        if (isAvailable) {
            status = "Con sach";
        } else {
            status = "Da muon";
        }

        System.out.println("\n--- PHIEU THONG TIN SACH ---");
        System.out.println("Ten sach: " + bookNameUpper);
        System.out.println("Ma so: " + bookID + " | Tuoi tho: " + age + " nam");
        System.out.printf("Gia ban: %.2f VND\n", price);
        System.out.println("Tinh trang: " + status);
    }
}
