package session07;

// Lớp ClassRoom dùng để quản lý quỹ lớp
class ClassRoomBai04 {

    // Biến static: quỹ lớp dùng chung cho tất cả sinh viên
    private static double classFund = 0;

    // Biến instance: tên sinh viên (dữ liệu riêng)
    private String tenSinhVien;

    public ClassRoomBai04(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    // Phương thức đóng tiền vào quỹ lớp
    public void dongTien(double soTien) {
        classFund += soTien;
        System.out.println(tenSinhVien + " đã đóng " + soTien + " vào quỹ lớp.");
    }

    // Phương thức static xem tổng quỹ lớp
    public static void xemTongQuyLop() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}

// Lớp chạy chương trình
public class Bai04 {

    public static void main(String[] args) {

        ClassRoomBai04 sv1 = new ClassRoomBai04("Nguyễn Văn A");
        ClassRoomBai04 sv2 = new ClassRoomBai04("Trần Thị B");
        ClassRoomBai04 sv3 = new ClassRoomBai04("Lê Văn C");

        // Nhiều sinh viên cùng đóng tiền vào quỹ lớp
        sv1.dongTien(100000);
        sv2.dongTien(150000);
        sv3.dongTien(200000);

        // Xem tổng quỹ lớp
        ClassRoomBai04.xemTongQuyLop();
    }
}
