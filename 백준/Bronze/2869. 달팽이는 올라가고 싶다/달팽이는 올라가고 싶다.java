import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		
		/* 2869 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		int d = (v - b)/(a - b);
		if((v - b)%(a - b) != 0){
			d++;
		}
		System.out.println(d);
	}
}

