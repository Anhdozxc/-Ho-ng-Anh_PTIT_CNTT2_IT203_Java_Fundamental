package session04;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Bai05 {
    public static void main(String[] args) {
        String log = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";

        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (\\w+) \\| BookID: (\\w+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(log);

        if (matcher.find()) {
            System.out.println("Ngày: " + matcher.group(1));
            System.out.println("Người dùng: " + matcher.group(2));
            System.out.println("Hành động: " + matcher.group(3));
            System.out.println("Mã sách: " + matcher.group(4));
        }
    }
}
