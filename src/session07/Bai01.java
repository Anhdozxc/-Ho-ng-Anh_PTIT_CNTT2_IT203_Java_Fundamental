package session07;

// class Student
class Student {

    // bien instance
    private String maSV;
    private String tenSV;

    // bien static dung chung
    private static int totalStudent = 0;

    public Student(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        totalStudent++;
    }

    public void hienThiThongTin() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ten SV: " + tenSV);
    }

    public static int getTotalStudent() {
        return totalStudent;
    }
}
public class Bai01 {

    public static void main(String[] args) {

        Student sv1 = new Student("SV01", "Nguyen Van A");
        Student sv2 = new Student("SV02", "Tran Thi B");
        Student sv3 = new Student("SV03", "Le Van C");

        sv1.hienThiThongTin();
        System.out.println();

        sv2.hienThiThongTin();
        System.out.println();

        sv3.hienThiThongTin();
        System.out.println();

        System.out.println("Tong so sinh vien da tao: " + Student.getTotalStudent());
    }
}


