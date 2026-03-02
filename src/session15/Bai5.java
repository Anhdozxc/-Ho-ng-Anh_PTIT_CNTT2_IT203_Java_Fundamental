package session15;

import java.util.*;

class TreatmentStep {
    private String description;
    private String time;

    public TreatmentStep(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String toString() {
        return description + " - " + time;
    }
}

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Đã thêm bước xử lý cho " + patient);
    }

    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            System.out.println("Hoàn tác bước gần nhất của " + patient);
            return steps.pop();
        } else {
            System.out.println("Không có bước để hoàn tác.");
            return null;
        }
    }

    public void displaySteps() {
        System.out.println("Các bước xử lý của " + patient + ":");
        for (TreatmentStep s : steps) {
            System.out.println(s);
        }
    }
}

class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases = new LinkedList<>();

    public void addCase(EmergencyCase c) {
        cases.add(c);
        System.out.println("Đã thêm ca cấp cứu vào hàng đợi.");
    }

    public EmergencyCase getNextCase() {
        return cases.poll();
    }
}

public class Bai5 {
    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        EmergencyCase c1 = new EmergencyCase(new Patient("Nguyễn Văn A"));
        EmergencyCase c2 = new EmergencyCase(new Patient("Trần Thị B"));

        queue.addCase(c1);
        queue.addCase(c2);

        EmergencyCase current = queue.getNextCase();

        current.addStep(new TreatmentStep("Tiếp nhận", "08:00"));
        current.addStep(new TreatmentStep("Chẩn đoán", "08:10"));
        current.addStep(new TreatmentStep("Điều trị", "08:20"));

        current.displaySteps();

        current.undoStep();

        current.displaySteps();
    }
}