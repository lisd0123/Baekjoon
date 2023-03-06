import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
		/* 2562 최댓값 */
		Scanner sc = new Scanner(System.in);
		int[] a = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < 9; i++) {
			a[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < 9; i++) {
			if(a[i]>max) {
				max = a[i];
				index = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}

