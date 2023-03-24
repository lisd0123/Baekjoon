import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(br.readLine());
    	String arr [] = new String [n];
    	for(int i = 0; i < n; i++) {
    		arr[i] = br.readLine();
    	}

    	Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});

    	System.out.println(arr[0]);
    	for (int i = 1; i < n; i++) {
			if (!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}
	}
}
