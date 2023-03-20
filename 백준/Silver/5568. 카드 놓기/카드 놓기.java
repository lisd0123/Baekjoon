import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static int n, k;
    static int[] cards;
    static boolean[] visited;
    static HashSet<String> numbers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        cards = new int[n];
        visited = new boolean[n];
        numbers = new HashSet<String>();

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        combination(k, "");

        System.out.println(numbers.size());
    }

    static void combination(int remain, String str) {
        if (remain == 0) {
            numbers.add(str);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(remain-1, str + cards[i]);
                visited[i] = false;
            }
        }
    }
    
    
}