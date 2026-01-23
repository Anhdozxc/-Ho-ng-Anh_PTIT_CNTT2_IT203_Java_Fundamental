package session01;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mời bạn nhập số thứ tự của sách trong hệ thống: ");
        int stt = sc.nextInt();

        // Xác định kệ sách (mỗi kệ 25 cuốn)
        int ke = (stt - 1) / 25 + 1;

        // Xác định vị trí trên kệ (1 -> 25)
        int viTri = (stt - 1) % 25 + 1;

        // Xác định khu vực bằng toán tử điều kiện
        String khuVuc = (ke <= 10) ? "Khu Cận (Gần cửa)" : "Khu Viễn";

        System.out.println("\n--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Kệ " + ke + " - Vị trí " + viTri);
        System.out.println("Phân khu: " + khuVuc);
    }
}
