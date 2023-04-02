import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    int l = sc.nextInt();
	    int x[] = new int[n];
	    int y[] = new int[n];
	    int possible = 0;
	    int hunter[] = new int [n];
	    
	    for(int i = 0; i < m; i++) {
	    	hunter[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(hunter);
	    
	    for(int i = 0; i < n; i++) {
	    	x[i] = sc.nextInt();
	    	y[i] = sc.nextInt();	
	    }
	    
	    for(int j = 0; j < n; j++) {
	    	for(int i = 0; i < n; i++) {
		    	if(Math.abs(x[j] - hunter[i]) + y[j] <= l) {
		    		possible += 1;
		    		break;
		    	}
	    	}
	    }
	     
	    System.out.println(possible);
	    }
}