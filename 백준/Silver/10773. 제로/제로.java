import java.util.Scanner;
import java.util.Stack;
 
public class Main {
	
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        long total = 0;

        for (int i = 0; i < k; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(num);
            }
        }

        while (!stack.isEmpty()) {
            total += stack.pop();
        }

        System.out.println(total);
    }
}