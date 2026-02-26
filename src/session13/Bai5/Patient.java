package session13.Bai5;

import java.util.*;

class Patient {
    String id;
    String fullName;
    int age;
    String diagnosis;

    public Patient(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "ID : " + id + " | FullName : " + fullName +
                " | Age : " + age + " | Diagnosis : " + diagnosis;
    }
}
