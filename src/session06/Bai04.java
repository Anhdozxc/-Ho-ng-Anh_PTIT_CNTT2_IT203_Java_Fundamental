package session06;

class Employee {
    // Thuoc tinh
    String maNV;
    String tenNV;
    double luong;

    // Constructor khong tham so
    public Employee() {
        this.maNV = "Chua co";
        this.tenNV = "Chua co";
        this.luong = 0;
    }

    // Constructor co ma va ten
    public Employee(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = 0;
    }

    // Constructor day du ma, ten, luong
    public Employee(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    // Phuong thuc hien thi thong tin nhan vien
    public void hienThiThongTin() {
        System.out.println("Ma nhan vien: " + maNV);
        System.out.println("Ten nhan vien: " + tenNV);
        System.out.println("Luong: " + luong);
    }
}

public class Bai04 {
    public static void main(String[] args) {
        // Tao doi tuong bang cac constructor khac nhau
        Employee nv1 = new Employee();
        Employee nv2 = new Employee("NV01", "Nguyen Dinh Son");
        Employee nv3 = new Employee("NV02", "Vu Duc Huy Hoang", 12000000);

        // Hien thi thong tin
        nv1.hienThiThongTin();
        nv2.hienThiThongTin();
        nv3.hienThiThongTin();
    }
}
