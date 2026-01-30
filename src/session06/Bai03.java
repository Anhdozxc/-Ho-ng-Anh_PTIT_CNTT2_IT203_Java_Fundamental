package session06;

class Product {
    // Thuoc tinh (dong goi)
    private String maSP;
    private String tenSP;
    private double giaBan;

    // Constructor
    public Product(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan);
    }

    // Getter
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    // Setter co kiem tra du lieu
    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("Gia ban khong hop le");
        }
    }

    // Phuong thuc hien thi thong tin san pham
    public void hienThiThongTin() {
        System.out.println("Ma san pham: " + maSP);
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Gia ban: " + giaBan);
        System.out.println("----------------------");
    }
}

public class Bai03 {
    public static void main(String[] args) {
        Product sp = new Product("SP01", "Laptop", 15000000);

        // Hien thi thong tin ban dau
        sp.hienThiThongTin();

        // Thu set gia khong hop le
        sp.setGiaBan(-5000);

        // Hien thi lai thong tin
        sp.hienThiThongTin();
    }
}
