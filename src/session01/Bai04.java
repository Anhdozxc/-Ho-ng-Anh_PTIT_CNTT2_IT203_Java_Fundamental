package session01;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mời bạn nhập giá sách (USD)
        System.out.print("Mời bạn nhập giá sách (USD - kiểu double): ");
        double usdPrice = sc.nextDouble();

        // Mời bạn nhập tỷ giá
        System.out.print("Mời bạn nhập tỷ giá (VNĐ - kiểu float): ");
        float exchangeRate = sc.nextFloat();

        // Tính tổng tiền VNĐ (kiểu double)
        double totalVND = usdPrice * exchangeRate;

        // Ép kiểu sang long để lấy số tiền chẵn
        long roundedVND = (long) totalVND;

        // Xuất kết quả
        System.out.println("Giá chính xác (số thực): " + totalVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedVND);
    }
}
