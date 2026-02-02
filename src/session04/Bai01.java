package session04;

public class Bai01 {
    public static void main(String[] args) {
        String title = "  lập   TRÌNH   java   cơ  bản  ";
        String author = "  nguyễn   văn   a  ";

        // Xu ly ten sach
        title = title.trim();                 // bo khoang trang dau cuoi
        title = title.replaceAll("\\s+", " "); // bo khoang trang thua giua
        title = title.toUpperCase();           // viet hoa
        // Xu ly ten tac gia
        author = author.trim();
        author = author.replaceAll("\\s+", " ");
        author = author.toLowerCase();

        String[] words = author.split(" ");
        String authorResult = "";

        for (int i = 0; i < words.length; i++) {
            authorResult += words[i].substring(0, 1).toUpperCase()
                    + words[i].substring(1) + " ";
        }
        authorResult = authorResult.trim();
        System.out.println(title + " - Tác giả: " + authorResult);
    }
}

