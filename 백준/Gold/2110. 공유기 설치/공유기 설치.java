import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	
	public static int[] house; 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		
		house = new int[n];
		
		for(int i = 0; i < n; i++) {
			house[i] = sc.nextInt();
		}
	
		Arrays.sort(house);
		
		int max = (house[n-1] - house[0]) + 1;
		int start = 1; 
		
		while(start < max) {
			int mid = (start + max) / 2;
			
			if(possible(mid) < c) {
				 max = mid;
			}
			else {
				start = mid + 1;
			}
		}
		System.out.println(start - 1);
		
		
	}
	
	public static int possible(int distance) {
		int count = 1;
		int lastLocate = house[0];
		
		for(int i = 1; i < house.length; i++) {
			int locate = house[i];
			if(locate - lastLocate >= distance) {
				count++;
				lastLocate = locate;
			}
		}
		return count;
	}
}