package session01;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so ngay cham tre: ");
        int n = sc.nextInt();

        System.out.print("Nhap so luong sach muon: ");
        int m = sc.nextInt();

        // Tinh tien phat goc
        double total = n * m * 5000;
        System.out.println("Tien phat goc: " + total + " VND");

        // Dieu kien tang phat
        if (n > 7 && m >= 3) {
            total = total * 1.2;
        }

        // Xuat tien phat sau dieu chinh
        System.out.println("Tien phat sau dieu chinh: " + total + " VND");

        // Kiem tra yeu cau khoa the
        boolean lockCard;
        if (total > 50000) {
            lockCard = true;
        } else {
            lockCard = false;
        }

        System.out.println("Yeu cau khoa the: " + lockCard);
    }
}
