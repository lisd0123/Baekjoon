import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		/* 2577 Scanner */
//		Scanner sc = new Scanner(System.in);
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int C = sc.nextInt();
//		int D = A * B * C;
//		String str = Integer.toString(D);
//		System.out.println(D);
//		for(int i = 0; i < 10; i++) {
//			int count = 0;
//			for(int j = 0; j< str.length(); j++) {
//				if((str.charAt(j) -'0') ==  i) {
//					count++;
//				}
//			}
//			System.out.println(count);
//		}
		
		/* 2577 BufferedReader */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		String str = String.valueOf(val);
		
		for(int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i) - 48)]++; 
		}
		for(int v : arr) {
			System.out.println(v);
		}
	}
}

