import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for(int i = 0; i < k; i++) {
            String vps = sc.next();
            Stack<Character> stack = new Stack<>();

            for(int j = 0; j < vps.length(); j++) {
                char c = vps.charAt(j);
                if(c == '(') {
                    stack.push(c);
                }else if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }else {
                    stack.push(c);
                    break;
                }
            }

            if(stack.isEmpty()) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
