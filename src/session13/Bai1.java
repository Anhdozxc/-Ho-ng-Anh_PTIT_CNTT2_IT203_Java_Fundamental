package session13;

import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {
    public static void main(String[] args) {

        // Tạo danh sách thân nhiệt ban đầu
        ArrayList<Double> list = new ArrayList<>();
        list.add(36.5);
        list.add(40.2);
        list.add(37.0);
        list.add(12.5);
        list.add(39.8);
        list.add(99.9);
        list.add(36.8);

        System.out.println("Danh sách ban đầu: " + list);

        // Sử dụng Iterator để lọc giá trị không hợp lệ
        Iterator<Double> iterator = list.iterator();
        while (iterator.hasNext()) {
            double temp = iterator.next();
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove(); // Xóa an toàn
            }
        }

        System.out.println("Danh sách sau khi lọc: " + list);

        // Tính nhiệt độ trung bình
        double sum = 0;
        for (double temp : list) {
            sum += temp;
        }

        double average = sum / list.size();

        System.out.printf("Nhiệt độ trung bình: %.2f", average);
    }
}
