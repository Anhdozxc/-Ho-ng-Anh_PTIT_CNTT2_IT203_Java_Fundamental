package session09;

// Lop Person
class Person {
    // Thuoc tinh
    protected String hoTen;
    protected int tuoi;

    // Constructor
    public Person(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    // Phuong thuc hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
    }
}

// Lop Student ke thua Person
class Student extends Person {
    // Thuoc tinh bo sung
    private String maSinhVien;
    private double diemTrungBinh;

    // Constructor
    public Student(String hoTen, int tuoi, String maSinhVien, double diemTrungBinh) {
        super(hoTen, tuoi); // goi constructor lop cha
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Hien thi day du thong tin sinh vien
    public void hienThiThongTin() {
        super.hienThiThongTin(); // dung lai code lop cha
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Diem trung binh: " + diemTrungBinh);
    }
}

public class Bai01 {
    public static void main(String[] args) {
        Student sv = new Student("Phạm Đức Đạt", 19, "SV001", 8.5);
        sv.hienThiThongTin();
    }
}
