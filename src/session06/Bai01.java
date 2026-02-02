package session06;

class Student {
    // Thuoc tinh
    String maSinhVien;
    String hoTen;
    int namSinh;
    double diemTrungBinh;

    // Constructor co tham so
    public Student(String maSinhVien, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Phuong thuc hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Diem trung binh: " + diemTrungBinh);
        System.out.println("----------------------");
    }
}

public class Bai01 {
    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyen Duc Anh", 2006, 8.5);
        Student sv2 = new Student("SV002", "Nguyen Dang Duong", 2006, 7.8);

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}
