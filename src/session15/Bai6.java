package session15;

import java.util.*;

class Patient {
    String id;
    String name;
    int age;
    String gender;

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return id + " - " + name;
    }
}

class PatientWaitingQueue {
    Queue<Patient> waitingQueue = new LinkedList<>();
    int totalPatients = 0;

    public void addPatient(Patient p) {
        waitingQueue.add(p);
        totalPatients++;
    }

    public Patient getNextPatient() {
        if (!waitingQueue.isEmpty()) {
            totalPatients--;
            return waitingQueue.poll();
        }
        return null;
    }
}

//LỊCH SỬ CHỈNH SỬA
class EditAction {
    String description;
    String editedBy;
    String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    public String toString() {
        return description + " - " + editedBy + " - " + editTime;
    }
}

class MedicalRecordHistory {
    Stack<EditAction> editStack = new Stack<>();
    String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditAction e) {
        editStack.push(e);
    }

    public EditAction undoEdit() {
        if (!editStack.isEmpty()) {
            return editStack.pop();
        }
        return null;
    }
}


//  HỆ THỐNG GỌI SỐ (Queue)
class Ticket {
    int ticketNumber;
    String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    public String toString() {
        return "Số: " + ticketNumber;
    }
}

class TicketSystem {
    Queue<Ticket> ticketQueue = new LinkedList<>();
    int currentNumber = 0;

    public void issueTicket(String time) {
        currentNumber++;
        ticketQueue.add(new Ticket(currentNumber, time));
    }

    public Ticket callNext() {
        return ticketQueue.poll();
    }
}


//  HOÀN TÁC NHẬP LIỆU (Stack)
class InputAction {
    String fieldName;
    String oldValue;
    String newValue;
    String actionTime;

    public InputAction(String fieldName, String oldValue, String newValue, String actionTime) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = actionTime;
    }
}

class UndoManager {
    Stack<InputAction> undoStack = new Stack<>();
    int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputAction action) {
        if (undoStack.size() < maxUndoSteps) {
            undoStack.push(action);
        }
    }

    public InputAction undo() {
        if (!undoStack.isEmpty()) {
            return undoStack.pop();
        }
        return null;
    }
}


//  MAIN TEST
public class Bai6 {
    public static void main(String[] args) {

        PatientWaitingQueue queue = new PatientWaitingQueue();
        queue.addPatient(new Patient("P01", "Nguyễn Văn A", 30, "Nam"));
        queue.addPatient(new Patient("P02", "Trần Thị B", 25, "Nữ"));

        System.out.println("Gọi bệnh nhân: " + queue.getNextPatient());

        MedicalRecordHistory history = new MedicalRecordHistory("R01");
        history.addEdit(new EditAction("Sửa chẩn đoán", "Bác sĩ A", "09:00"));

        TicketSystem system = new TicketSystem();
        system.issueTicket("09:05");
        System.out.println("Gọi số: " + system.callNext());

        UndoManager manager = new UndoManager(5);
        manager.addAction(new InputAction("Tên", "A", "B", "09:10"));
        manager.undo();
    }
}