package session09;
// Lớp Employee
class Employee {
    protected String ten;
    protected double luongCoBan;
    // Constructor có tham số
    public Employee(String ten, double luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }
}
// Lớp Manager kế thừa Employee
class Manager extends Employee {
    // Thuộc tính bổ sung
    private String phongBan;

    // Constructor sử dụng super() để gọi constructor lớp cha
    public Manager(String ten, double luongCoBan, String phongBan) {
        super(ten, luongCoBan); // super() phải là dòng đầu tiên
        this.phongBan = phongBan;
    }
    public void hienThiThongTin() {
        System.out.println("Tên nhân viên: " + ten);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Phòng ban: " + phongBan);
    }
}

public class Bai03 {
    public static void main(String[] args) {
        Manager ql = new Manager("Vũ Đức Huy Hoàng", 15000000, "Kỹ thuật");
        ql.hienThiThongTin();
    }
}
