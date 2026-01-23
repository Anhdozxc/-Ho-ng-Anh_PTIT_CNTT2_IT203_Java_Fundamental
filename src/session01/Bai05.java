package session01;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mời bạn nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();

        // Tách các chữ số bằng toán tử số học
        int thousands = code / 1000;
        int hundreds = (code / 100) % 10;
        int dozens = (code / 10) % 10;
        int units = code % 10;

        // Tính tổng 3 chữ số đầu
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;

        // Tính số kiểm tra
        int checkDigit = sumOfFirstThreeNumber % 10;

        System.out.println("Chữ số kiểm tra kỳ vọng: " + checkDigit);

        // Kiểm tra hợp lệ
        boolean isValid = (checkDigit == units);

        if (isValid) {
            System.out.println("Kết quả kiểm tra mã sách: HỢP LỆ");
        } else {
            System.out.println("Kết quả kiểm tra mã sách: SAI MÃ");
        }
    }
}
