import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main { // 순열구하기
	static int max =0; 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int [n];
		String number = br.readLine();
		StringTokenizer st = new StringTokenizer(number, " ");
		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		perm(arr, 0, n);
		System.out.println(max);
		
	}
	
	public static void perm(int[] arr, int depth, int n){
		if(depth ==n){
			sum(arr, n);
			return;
		}
		for(int i=depth; i<n; i++){
			swap(arr, i, depth);
			perm(arr, depth+1, n);
			swap(arr, i, depth);
		}
	}
	
	
	static void swap(int[] arr, int depth, int n) {
		int temp = arr[depth];
		arr[depth] = arr[n]; 
		arr[n] = temp;
		
	}
 
 
	static void sum(int[] arr, int k) {
		int sum =0;
		for (int i = 2; i <= k; i++) { 
			sum += Math.abs(arr[i-2]-arr[i-1]);
		}
		if(max<sum){
			max = sum;
		}
 
	}
	
}