package session09;
// Lớp Animal
class Animal {
    // Phương thức phát ra tiếng kêu
    public void sound() {
        System.out.println("Động vật phát ra âm thanh");}}
// Lớp Dog kế thừa Animal
class Dog extends Animal {
    // Ghi đè phương thức sound
    @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu");
    }
}

// Lớp Cat kế thừa Animal
class Cat extends Animal {
    // Ghi đè phương thức sound
    @Override
    public void sound() {
        System.out.println("Mèo kêu: Meo meo");
    }
}

public class Bai02 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Gọi phương thức sound để kiểm tra ghi đè
        dog.sound();
        cat.sound();
    }
}
