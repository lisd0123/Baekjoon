import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {
	
    public static void main(String[] args) throws NumberFormatException, IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int arr [] = new int [9];
    	int sum = 0;
    	int spyA = 0, spyB = 0;
    	for(int i = 0; i < 9; i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    		sum += arr[i];
    	}
    	Arrays.sort(arr);
    	
    	for(int i = 0; i < arr.length-1; i++) { 
			for(int j = i+1; j < arr.length; j++) {
				if(sum - arr[i] - arr[j] == 100) { 
					spyA = i;
					spyB = j;
					break;
				}
			}
		}
    	
    	for(int j = 0; j < arr.length; j++) { 
			if(j == spyA || j == spyB) 
				continue;
			System.out.println(arr[j]);
		}
	}
}