package session06;

class Account {
    // Thuoc tinh
    String username;
    String password;
    String email;

    // Constructor
    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Phuong thuc doi mat khau
    public void doiMatKhau(String matKhauMoi) {
        this.password = matKhauMoi;
        System.out.println("Doi mat khau thanh cong");
    }

    // Hien thi thong tin tai khoan (an mat khau)
    public void hienThiThongTin() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Mat khau: ******");
    }
}

public class Bai02 {
    public static void main(String[] args) {
        Account acc = new Account("hoanganh", "123456", "hoanganh@gmail.com");

        acc.hienThiThongTin();
        acc.doiMatKhau("abcdefghj");
        acc.hienThiThongTin();
    }
}
