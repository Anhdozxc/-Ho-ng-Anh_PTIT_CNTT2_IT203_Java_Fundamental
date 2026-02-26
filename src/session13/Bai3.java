package session13;
import java.util.ArrayList;
import java.util.List;
public class Bai3 {
    // Generic tìm phần tử chung
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for (T item : listA) {
            if (listB.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // Test Case 1 Integer
        List<Integer> list1 = new ArrayList<>();
        list1.add(101);
        list1.add(102);
        list1.add(105);
        List<Integer> list2 = new ArrayList<>();
        list2.add(102);
        list2.add(105);
        list2.add(108);

        List<Integer> commonInt = findCommonPatients(list1, list2);
        System.out.println("Test Case 1 Output: " + commonInt);

        // Test Case 2 String
        List<String> list3 = new ArrayList<>();
        list3.add("DN01");
        list3.add("DN02");
        list3.add("DN03");

        List<String> list4 = new ArrayList<>();
        list4.add("DN02");
        list4.add("DN04");

        List<String> commonString = findCommonPatients(list3, list4);
        System.out.println("Test Case 2 Output: " + commonString);
    }
}
