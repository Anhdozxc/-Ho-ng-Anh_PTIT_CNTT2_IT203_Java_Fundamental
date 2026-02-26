package session13;
import java.util.LinkedList;
public class EmergencyRoom_Bai4 {
    private LinkedList<String> queue = new LinkedList<>();
    // Bệnh nhân thường vào cuối hàng đợi
    public void patientCheckIn(String name) {
        queue.addLast(name);
    }
    // Ca cấp cứu vào đầu hàng đợi
    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
    }
    // Gọi bệnh nhân đầu tiên
    public void treatPatient() {
        if (!queue.isEmpty()) {
            String name = queue.removeFirst();

            // Nếu là bệnh nhân cấp cứu đứng đầu sau khi addFirst
            if (name.equals("C")) {
                System.out.println("Đang cấp cứu: " + name);
            } else {
                System.out.println("Đang khám: " + name);
            }
        }
    }
    public static void main(String[] args) {
        EmergencyRoom_Bai4 er = new EmergencyRoom_Bai4();
        // Mô phỏng
        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}
