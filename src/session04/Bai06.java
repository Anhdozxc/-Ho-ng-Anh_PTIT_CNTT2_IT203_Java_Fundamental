package session04;

public class Bai06 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";
        // Danh sach tu nhay cam
        String[] blacklist = {"tệ", "ngu ngốc"};

        // Thay the tu nhay cam bang ****
        for (int i = 0; i < blacklist.length; i++) {
            String word = blacklist[i];
            String stars = "";
            for (int j = 0; j < word.length(); j++) {
                stars += "*";
            }

            review = review.replaceAll("(?i)" + word, stars);
        }
        // Neu qua 200 ky tu thi cat va them ...
        if (review.length() > 200) {
            int cut = review.lastIndexOf(" ", 200);
            StringBuilder sb = new StringBuilder();
            sb.append(review.substring(0, cut));
            sb.append("...");
            review = sb.toString();
        }

        System.out.println("Review sau khi xử lý: " + review);
    }
}
