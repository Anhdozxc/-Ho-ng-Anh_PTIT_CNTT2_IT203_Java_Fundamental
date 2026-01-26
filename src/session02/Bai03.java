package session02;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Moi ban nhap so luong sach tra muon: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Moi ban nhap so ngay tre cua cuon sach thu " + i + ": ");
            int soNgayTre = sc.nextInt();
            total = total + soNgayTre * 5000;
        }

        System.out.println("Tong tien phat: " + total + " VND");

        sc.close();
    }
}
