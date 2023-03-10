import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		/* 1152 */
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int w = 0;
		
		for(int i = 1; i < str.length(); i++) {
					if(str.charAt(i) == 32 && str.charAt(i-1) != 32) {        // i번째 문자열이 공백이면 +1씩 -> else구문으로 마지막이 공백일때 +1해줌 
						w++;
					}
			}
		if(str.charAt(str.length()-1) != 32) {
			w++;
		}
		System.out.println(w);
	}
}

