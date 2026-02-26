package session13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai2 {
    public static List<String> xuLyDanhSach(List<String> input) {

        // Tạo danh sách mới chứa thuốc không trùng
        List<String> uniqueList = new ArrayList<>();

        for (String thuoc : input) {
            if (!uniqueList.contains(thuoc)) {
                uniqueList.add(thuoc);
            }
        }
        // Sắp xếp theo thứ tự A-Z
        Collections.sort(uniqueList);

        return uniqueList;
    }
    public static void main(String[] args) {

        List<String> input = new ArrayList<>();
        input.add("Paracetamol");
        input.add("Ibuprofen");
        input.add("Panadol");
        input.add("Paracetamol");
        input.add("Aspirin");
        input.add("Ibuprofen");

        System.out.println("Input: " + input);

        List<String> output = xuLyDanhSach(input);

        System.out.println("Output: " + output);
    }
}
