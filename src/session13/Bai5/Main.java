package session13.Bai5;
import java.util.*;
public class Main {
    static ArrayList<Patient> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    showPatients();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
            }
        }
    }
    public static void menu() {
        System.out.println("=========MENU=========");
        System.out.println("1. Tiếp nhận bệnh nhân");
        System.out.println("2. Cập nhật chẩn đoán");
        System.out.println("3. Xuất viện");
        System.out.println("4. Sắp xếp danh sách bệnh nhân");
        System.out.println("5. Hiển thị danh sách bệnh nhân");
        System.out.println("6. Thoát");
        System.out.print("Chọn chức năng: ");
    }
    // 1. Thêm bệnh nhân
    public static void addPatient() {
        System.out.print("Nhập ID bệnh nhân: ");
        String id = sc.nextLine();

        for (Patient p : list) {
            if (p.id.equals(id)) {
                System.out.println("ID đã tồn tại.");
                return;
            }
        }

        System.out.print("Nhập tên bệnh nhân: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        list.add(new Patient(id, name, age, diagnosis));
        System.out.println("Bệnh nhân đã được thêm thành công.");
    }
    // 2. Cập nhật chẩn đoán
    public static void updateDiagnosis() {
        System.out.print("Nhập ID bệnh nhân để cập nhật chẩn đoán: ");
        String id = sc.nextLine();

        for (Patient p : list) {
            if (p.id.equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                p.diagnosis = sc.nextLine();
                System.out.println("Chẩn đoán đã được cập nhật.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
    }
    // 3. Xuất viện
    public static void dischargePatient() {
        System.out.print("Nhập ID bệnh nhân để xuất viện: ");
        String id = sc.nextLine();

        Iterator<Patient> it = list.iterator();
        while (it.hasNext()) {
            Patient p = it.next();
            if (p.id.equals(id)) {
                it.remove();
                System.out.println("Bệnh nhân đã xuất viện.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
    }
    // 4. Sắp xếp
    public static void sortPatients() {
        Collections.sort(list, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {

                // Tuổi giảm dần
                if (o1.age != o2.age) {
                    return o2.age - o1.age;
                }

                // Nếu tuổi bằng nhau -> tên A-Z
                return o1.fullName.compareTo(o2.fullName);
            }
        });

        System.out.println("Danh sách bệnh nhân đã được sắp xếp.");
    }
    // 5. Hiển thị
    public static void showPatients() {
        System.out.println("=====Danh sách bệnh nhân=====");
        for (Patient p : list) {
            System.out.println(p);
        }
    }
}
