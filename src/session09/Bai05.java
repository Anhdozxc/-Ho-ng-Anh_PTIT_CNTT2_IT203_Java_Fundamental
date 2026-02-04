package session09;

// Lớp cha EmployeeB5
class EmployeeB5 {
    // Phương thức tính lương sẽ được ghi đè ở lớp con
    public double calculateSalary() {
        return 0;
    }
}

// Nhân viên văn phòng
class OfficeEmployeeB5 extends EmployeeB5 {
    private double luongCoBan;
    private double phuCap;

    public OfficeEmployeeB5(double luongCoBan, double phuCap) {
        this.luongCoBan = luongCoBan;
        this.phuCap = phuCap;
    }

    // Ghi đè phương thức tính lương
    @Override
    public double calculateSalary() {
        return luongCoBan + phuCap;
    }
}

// Nhân viên sản xuất
class ProductionEmployeeB5 extends EmployeeB5 {
    private int soSanPham;
    private double tienMoiSanPham;

    public ProductionEmployeeB5(int soSanPham, double tienMoiSanPham) {
        this.soSanPham = soSanPham;
        this.tienMoiSanPham = tienMoiSanPham;
    }

    // Ghi đè phương thức tính lương
    @Override
    public double calculateSalary() {
        return soSanPham * tienMoiSanPham;
    }
}
public class Bai05 {
    public static void main(String[] args) {

        // Danh sách nhân viên kiểu khai báo là EmployeeB5
        EmployeeB5[] danhSach = new EmployeeB5[2];
        danhSach[0] = new OfficeEmployeeB5(8000000, 2000000);
        danhSach[1] = new ProductionEmployeeB5(500, 20000);

        double tongLuong = 0;
        // Duyệt danh sách và tính tổng lương
        for (int i = 0; i < danhSach.length; i++) {
            tongLuong += danhSach[i].calculateSalary();
        }

        System.out.println("Tổng lương của tất cả nhân viên là: " + tongLuong);
    }
}
