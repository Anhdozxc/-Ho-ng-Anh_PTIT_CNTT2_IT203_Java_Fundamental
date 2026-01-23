package session01;

public class Bai03 {
    public static void main(String[] args) {

        // Khai bao hai bien String
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        // In truoc khi hoan doi
        System.out.println("Truoc khi hoan doi: Book1 = " + book1 + ", Book2 = " + book2);

        // Bien tam temp de hoan doi
        String temp = book1;
        book1 = book2;
        book2 = temp;

        // In sau khi hoan doi
        System.out.println("Sau khi hoan doi: Book1 = " + book1 + ", Book2 = " + book2);

        /*
         * GIAI THICH STACK - HEAP:
         * - book1, book2, temp la cac bien nam tren Stack
         * - Gia tri chuoi "Java Basic", "Python Intro" duoc luu tren Heap
         * - Bien Stack khong chua noi dung chuoi, chi chua dia chi tham chieu toi Heap
         * - Khi gan temp = book1:
         *   temp va book1 cung tro toi chuoi "Java Basic" tren Heap
         * - Khi book1 = book2:
         *   book1 chuyen sang tro toi chuoi "Python Intro"
         * - Khi book2 = temp:
         *   book2 tro lai chuoi "Java Basic"
         * - Khong co chuoi nao bi sao chep, chi co tham chieu tren Stack thay doi
         */
    }
}
