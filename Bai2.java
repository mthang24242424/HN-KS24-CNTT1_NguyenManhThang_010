import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap doan van bat ki: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println("Tu xuat hien nhieu nhat " + getMaxWord(wordCount));
    }

    public static String getMaxWord(Map<String, Integer> wordCount) {
        String maxWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }
        return maxWord + " (xuat hien " + maxCount + " lan)";
    }
}
