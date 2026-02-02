package session07;

// Lớp User
class User {

    // id là final: không được thay đổi sau khi tạo
    private final int id;
    private String username;
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getter (không có setter cho id để bảo vệ dữ liệu)
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

//  Lớp UserManager quản lý người dùng
class UserManager {

    // Dữ liệu dùng chung cho toàn bộ chương trình
    private static User[] users = new User[100];
    private static int count = 0;

    // Phương thức static thêm người dùng
    public static void themNguoiDung(User user) {
        users[count] = user;
        count++;
        System.out.println("Đã thêm người dùng: " + user.getUsername());
    }

    // Phương thức static tìm kiếm người dùng theo username
    public static User timNguoiDung(String username) {
        for (int i = 0; i < count; i++) {
            if (users[i].getUsername().equals(username)) {
                return users[i];
            }
        }
        return null;
    }
}

// Lớp chạy chương trình
public class Bai06 {

    public static void main(String[] args) {

        // Tạo người dùng
        User u1 = new User(1, "admin", "123456");
        User u2 = new User(2, "student", "abcdef");

        // Thêm người dùng vào hệ thống (gọi static method)
        UserManager.themNguoiDung(u1);
        UserManager.themNguoiDung(u2);

        // Tìm kiếm người dùng
        User timDuoc = UserManager.timNguoiDung("student");

        if (timDuoc != null) {
            System.out.println("Tìm thấy người dùng:");
            System.out.println("ID: " + timDuoc.getId());
            System.out.println("Username: " + timDuoc.getUsername());
        } else {
            System.out.println("Không tìm thấy người dùng.");
        }

        /*
         * GIẢI THÍCH:
         * - id được khai báo final nên không thể thay đổi sau khi tạo
         * - Không có setter cho id để bảo vệ dữ liệu quan trọng
         * - UserManager dùng biến static để quản lý danh sách dùng chung
         * - Các phương thức static được gọi trực tiếp qua tên lớp
         * - Thiết kế thể hiện rõ dữ liệu riêng (User) và dữ liệu dùng chung (UserManager)
         */
    }
}
