import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FibonacciReturns {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
        int n=in.nextInt();
        if (n==0) {
            System.out.println(0);
        } else {
            System.out.println(calculateFibonacci(BigInteger.ZERO, BigInteger.ONE, n-1));
        }
        }
        in.close();
    }
    
    static BigInteger calculateFibonacci (BigInteger n1, BigInteger n2, int limit) {
		if (limit>0) return calculateFibonacci(n2, n1.add(n2), --limit);
		return n2;
	}
}
