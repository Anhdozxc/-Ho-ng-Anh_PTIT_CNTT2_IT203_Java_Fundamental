package session03;

public class Bai03 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }
        System.out.println("Sach co so luong nhieu nhat " + max + ":");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.printf("-%s\n", names[i]);
            }
        }
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }
        System.out.println("Sach co so luong it nhat " + min + ":");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.printf("-%s\n", names[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {
                "Java Basic",
                "Python Intro",
                "C Programming",
                "Data Structures",
                "Algorithms"
        };
        int[] quantities = {10, 5, 10, 3, 5};
        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }
}