import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FibonacciLite {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if (n==0) {
            System.out.println(0);
        } else {
            System.out.println(calculateFibonacci(0, 1, n-1));
        }
    }
    
    static int calculateFibonacci (int n1, int n2, int limit) {
		if (limit>0) return calculateFibonacci(n2, n1+n2, --limit);
		return n2;
	}
}
