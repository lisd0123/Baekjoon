import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
		/* 10871 X보다 작은 수 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			if(a < x) {
				System.out.print(a +" ");
			}
		}	
	}
}

