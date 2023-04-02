import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    	public static void main(String[] args) throws NumberFormatException, IOException {
    		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    		StringTokenizer st = new StringTokenizer(in.readLine());
    		int w = Integer.parseInt(st.nextToken());
    		int h = Integer.parseInt(st.nextToken());

    		int N = Integer.parseInt(in.readLine());

    		LinkedList<Integer> listx = new LinkedList<Integer>();
    		LinkedList<Integer> listy = new LinkedList<Integer>();

    		for (int i = 0; i < N; i++) {
    			st = new StringTokenizer(in.readLine());
    			int path = Integer.parseInt(st.nextToken());
    			int point = Integer.parseInt(st.nextToken());

    			if (path == 0) {
    				listx.add(point);
    			}
    			if (path == 1) {
    				listy.add(point);
    			}
    		}

    		listx.add(h);
    		listx.add(0);
    		listy.add(w);
    		listy.add(0);

    		listx.sort(null);
    		listy.sort(null);

    		int max_x = 0;
    		for (int i = listx.size() - 1; i > 0; i--) {
    			int temp = listx.get(i) - listx.get(i - 1);
    			if (max_x < temp) {
    				max_x = temp;
    			}
    		}

    		int max_y = 0;
    		for (int i = listy.size() - 1; i > 0; i--) {
    			int temp = listy.get(i) - listy.get(i - 1);
    			if (max_y < temp) {
    				max_y = temp;
    			}
    		}

    		System.out.println(max_x * max_y);
    	}
    }