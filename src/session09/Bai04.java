package session09;

// Lớp AnimalB4
class AnimalB4 {
    // Phương thức chung
    public void sound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

// Lớp DogB4 kế thừa AnimalB4
class DogB4 extends AnimalB4 {
    // Ghi đè phương thức sound
    @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu");
    }

    // Phương thức riêng của Dog
    public void wagTail() {
        System.out.println("Chó đang vẫy đuôi");
    }
}
public class Bai04 {
    public static void main(String[] args) {

        // Kiểu khai báo là AnimalB4, kiểu thực tế là DogB4
        AnimalB4 animal = new DogB4();

        // Gọi phương thức chung (đa hình runtime)
        animal.sound();

        // Không thể gọi trực tiếp phương thức riêng của DogB4
        // animal.wagTail(); // Lỗi biên dịch
        // Sử dụng instanceof để kiểm tra kiểu thực tế
        if (animal instanceof DogB4) {
            // Ép kiểu an toàn từ AnimalB4 sang DogB4
            DogB4 dog = (DogB4) animal;
            dog.wagTail();
        }
    }
}
