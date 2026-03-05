import java.util.Scanner;
import java.util.Stack;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ki: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        int mid = str.length() / 2;
        for (int i = 0; i < mid; i++) {
            stack.push(str.charAt(i));
        }

        int startIndex = (str.length() % 2 == 0) ? mid : mid + 1;

        for (int i = startIndex; i < str.length(); i++) {
            if (stack.isEmpty() || stack.pop() != str.charAt(i)) {
                System.out.println("Chuoi khong doi xung");
                return;
            }
        }
        System.out.println("Chuoi doi xung");
    }
}
