package session04;
public class Bai03 {
    public static void main(String[] args) {

        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };
        // Dung StringBuilder
        long startSB = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        sb.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        sb.append("Ngày tạo: 24/01/2026\n");

        for (int i = 0; i < transactions.length; i++) {
            sb.append("Giao dịch: ").append(transactions[i]).append("\n");
        }

        long endSB = System.currentTimeMillis();
        // Dung String thuong
        long startS = System.currentTimeMillis();

        String report = "--- BÁO CÁO MƯỢN SÁCH ---\n";
        report += "Ngày tạo: 24/01/2026\n";

        for (int i = 0; i < transactions.length; i++) {
            report += "Giao dịch: " + transactions[i] + "\n";
        }

        long endS = System.currentTimeMillis();
        System.out.print(sb.toString());
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String: " + (endS - startS));
    }
}
