import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        /* 4344 */
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		for(int o = 1; o < C+1; o++) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			int sum = 0;
			double t = 0.0;
			double r = 0; 
			for(int s = 0; s < N; s++) {
				arr[s] = sc.nextInt();
				
				sum += arr[s];
			}
			double avg = sum/N;
			for(int i = 0; i < N; i++) {
				if(arr[i] > avg) {
					t += 1.0;
				}
			}
			r = t/N;
			System.out.println(String.format("%.3f", r*100) + "%");
		}
	}
}

