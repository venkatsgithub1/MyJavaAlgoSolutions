import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getFactorial(n, BigInteger.ONE));
    }
    static BigInteger getFactorial(int n, BigInteger factorial) {
		if (n>0) {
			factorial=BigInteger.valueOf(n).multiply(getFactorial(n-1, factorial));
		}
		return factorial;
	}
}
