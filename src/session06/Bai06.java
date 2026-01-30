package session06;

import java.util.Scanner;

class User {
    // Thuoc tinh (dong goi)
    private int id;
    private String username;
    private String password;
    private String email;

    // Constructor
    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    // Setter co kiem tra
    public void setPassword(String password) {
        if (password != null && !password.equals("")) {
            this.password = password;
        } else {
            System.out.println("Mat khau khong duoc rong");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email khong hop le");
        }
    }

    // Hien thi thong tin (an password)
    public void hienThiThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("----------------------");
    }
}

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap id: ");
        int id = sc.nextInt();
        sc.nextLine(); // xu ly dong du

        System.out.print("Nhap username: ");
        String username = sc.nextLine();

        System.out.print("Nhap password: ");
        String password = sc.nextLine();

        System.out.print("Nhap email: ");
        String email = sc.nextLine();

        // Tao doi tuong User
        User u = new User(id, username, password, email);

        u.hienThiThongTin();
    }
}
