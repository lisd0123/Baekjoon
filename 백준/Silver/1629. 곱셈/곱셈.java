import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(pow(A, B, C));
    }
    
        static long pow(int a, int b, int mod) {
            if (b == 0)
                return 1;
            long n = pow(a, b / 2, mod);
            if (b % 2 == 0)
                return n * n % mod;
            else
        	return (n * n % mod) * a % mod;
        }
}