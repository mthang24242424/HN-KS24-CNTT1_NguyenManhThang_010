import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hoc sinh: ");
        int numbers = sc.nextInt();
        sc.nextLine();
        int pass = 0, fail = 0;
        double sum = 0;
        List<Double> scores = new ArrayList<>();
        for (int i = 0; i < numbers; i++) {
            System.out.println("Diem hoc sinh thu " + (i + 1));
            double score = sc.nextDouble();
            scores.add(score);
        }
        double max = scores.get(0);
        for (double score : scores) {
            if (score > max) {
                max = score;
            }
            if (score >= 5) {
                pass++;
            } else {
                fail++;
            }
            sum += score;
        }
        scores.sort(null);

        System.out.println("Diem cao nhat: " + max);
        System.out.println("Danh sach diem tang dan: " + scores);
        System.out.println("Diem trung binh: " + (sum / scores.size()));
        System.out.println("Thong ke: Dau:" + pass + " Rot:" + fail);
    }
}
