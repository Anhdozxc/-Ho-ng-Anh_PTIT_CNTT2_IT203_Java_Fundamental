package session07;

//  Lớp Config chứa các hằng số
class Config {

    // Hằng số static final: giá trị cố định, không được thay đổi
    public static final double MAX_SCORE = 10.0;
    public static final double MIN_SCORE = 0.0;
}

public class Bai05 {

    public static void main(String[] args) {

        double diem = 8.5;

        System.out.println("Điểm hiện tại: " + diem);
        System.out.println("Điểm tối đa: " + Config.MAX_SCORE);
        System.out.println("Điểm tối thiểu: " + Config.MIN_SCORE);

        // Kiểm tra điểm có hợp lệ hay không dựa trên hằng số
        if (diem >= Config.MIN_SCORE && diem <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ.");
        } else {
            System.out.println("Điểm không hợp lệ.");
        }

        /*
         * MINH HỌA LỖI BIÊN DỊCH:
         * Dòng code bên dưới NẾU mở comment ra sẽ báo lỗi,
         * vì hằng số static final không được phép thay đổi giá trị.
         */

        // Config.MAX_SCORE = 9.0; // LỖI BIÊN DỊCH

        /*
         * GIẢI THÍCH:
         * - static final dùng để khai báo hằng số
         * - Giá trị hằng số được gán một lần và không thể thay đổi
         * - final giúp bảo vệ dữ liệu, tránh bị sửa nhầm
         * - Quy ước đặt tên hằng số: VIẾT HOA, NGĂN CÁCH BẰNG DẤU GẠCH DƯỚI
         */
    }
}
