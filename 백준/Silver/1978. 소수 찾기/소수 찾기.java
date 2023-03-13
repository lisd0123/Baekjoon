import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	/* 1978 */
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int[] arr = new int[a];
	int b = 0;
	for(int i = 0; i < a; i++) {
		boolean s = true;
		int c = sc.nextInt();
		if(c == 1) {
			continue;
		}
		for(int d = 2; d <= Math.sqrt(c); d++) {
			if(c % d == 0) {
				s = false;
				break;
			}
		}
		if(s) {
			b++;
		}
	}
	System.out.println(b);
	}
}

