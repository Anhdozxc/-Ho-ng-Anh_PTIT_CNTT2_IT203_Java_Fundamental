package session10;

interface BonusCalculator {
    double getBonus();
}

abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}

class OfficeStaff extends Employee {

    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee implements BonusCalculator {

    private final double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

public class Bai5 {
    public static void main(String[] args) {

        Employee staff = new OfficeStaff("An", 8000);
        Employee manager = new Manager("Bình", 15000, 5000);

        System.out.println(staff.name + " - Lương: " + staff.calculateSalary());
        System.out.println(manager.name + " - Lương: " + manager.calculateSalary());
    }
}