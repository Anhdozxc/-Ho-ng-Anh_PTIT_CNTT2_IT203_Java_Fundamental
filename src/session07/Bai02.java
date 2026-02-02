package session07;
// Bien kieu tham chieu: bien se luu DIA CHI doi tuong trong Heap
class StudentBai02 {

    private String ten;

    public StudentBai02(String ten) {
        this.ten = ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }
}

public class Bai02 {

    public static void main(String[] args) {

        // SO SANH BIEN NGUYEN THUY
        // Bien nguyen thuy luu GIA TRI truc tiep trong Stack
        int a = 10;
        int b = a; // b sao chep gia tri cua a

        b = 20; // thay doi b khong anh huong a

        System.out.println("Bien nguyen thuy:");
        System.out.println("a = " + a); // a van = 10
        System.out.println("b = " + b); // b = 20
        System.out.println();

        // SO SANH BIEN THAM CHIEU
        // Bien tham chieu luu DIA CHI doi tuong trong Heap
        StudentBai02 sv1 = new StudentBai02("An");
        StudentBai02 sv2 = sv1; // sv2 sao chep dia chi cua sv1

        // Thay doi thong tin qua sv2
        sv2.setTen("Binh");

        System.out.println("Bien tham chieu:");
        System.out.println("Ten sv1: " + sv1.getTen());
        System.out.println("Ten sv2: " + sv2.getTen());

        /*
         * GIAI THICH:
         * - Bien nguyen thuy: sao chep GIA TRI
         *   => thay doi b khong lam a thay doi
         * - Bien tham chieu: sao chep DIA CHI
         *   => sv1 va sv2 cung tro toi 1 doi tuong
         *   => thay doi qua sv2 thi sv1 cung bi anh huong
         */
    }
}
