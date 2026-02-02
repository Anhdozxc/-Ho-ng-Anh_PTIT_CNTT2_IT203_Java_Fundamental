package session07;

// Lớp tiện ích xử lý điểm số
// Các phương thức đều là static nên KHÔNG cần tạo đối tượng
class ScoreUtils {

    // Phương thức static kiểm tra điểm đạt hay không đạt
    public static boolean kiemTraDat(double diem) {
        // Quy ước: điểm >= 5 là đạt
        if (diem >= 5) {
            return true;
        }
        return false;
    }

    // Phương thức static tính điểm trung bình
    public static double tinhDiemTrungBinh(double d1, double d2, double d3) {
        return (d1 + d2 + d3) / 3;
    }
}

// Lớp chạy chương trình
public class Bai03 {

    public static void main(String[] args) {

        double diem1 = 6.5;
        double diem2 = 7.0;
        double diem3 = 4.5;

        // Gọi phương thức static trực tiếp qua tên lớp
        double diemTB = ScoreUtils.tinhDiemTrungBinh(diem1, diem2, diem3);

        System.out.println("Điểm trung bình: " + diemTB);

        // Kiểm tra đạt / không đạt
        if (ScoreUtils.kiemTraDat(diemTB)) {
            System.out.println("Kết quả: Đạt");
        } else {
            System.out.println("Kết quả: Không đạt");
        }

    }
}
