package session04;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Bai04 {
    public static void main(String[] args) {
        String cardID = "TV202312345";
        // Regex dung
        String regex = "^TV\\d{4}\\d{5}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardID);
        if (matcher.matches()) {
            System.out.println("Mã thẻ hợp lệ!");
        } else {
            // Kiem tra loi cu the
            if (!cardID.startsWith("TV")) {
                System.out.println("Thiếu tiền tố TV");
            } else if (!cardID.substring(2, 6).matches("\\d{4}")) {
                System.out.println("Năm không hợp lệ");
            } else {
                System.out.println("Định dạng mã thẻ không hợp lệ");
            }
        }
    }
}
