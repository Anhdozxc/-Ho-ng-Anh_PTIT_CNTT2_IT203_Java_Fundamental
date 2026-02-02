package session03;

public class Bai06 {
    public static int[] sortBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] remove(int[] arr) {
        int[] temp = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[size++] = arr[i];
            }
        }
        int[] newarr = new int[size];
        for (int i = 0; i < size; i++) {
            newarr[i] = temp[i];
        }
        return newarr;
    }

    public static int[] mergeBooks(int[] a, int[] b) {
        int[] newarr = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            newarr[i] = a[i];
        }
        for (int i = a.length, j = 0; i < a.length + b.length; i++) {
            newarr[i] = b[j++];
        }
        newarr = sortBooks(newarr);
        newarr = remove(newarr);
        return newarr;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 3};
        int[] b = {2, 3, 3, 7, 8};
        int[] result = mergeBooks(a, b);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}