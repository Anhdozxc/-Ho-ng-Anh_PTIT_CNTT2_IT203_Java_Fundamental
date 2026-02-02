package session06;

class Book {
    // Thuoc tinh
    String maSach;
    String tenSach;
    String tacGia;

    // Constructor co tham so trung ten voi thuoc tinh
    public Book(String maSach, String tenSach, String tacGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
    }

    // Phuong thuc hien thi thong tin sach
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
    }
}

public class Bai05 {
    public static void main(String[] args) {
        Book b1 = new Book("S01", "Dế Mèn Phiêu Lưu Ký", "Tô Hoài");

        b1.hienThiThongTin();
    }
}
