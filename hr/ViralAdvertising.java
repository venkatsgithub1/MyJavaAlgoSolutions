import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(getNumberLiked(5, 0, n));
    }
    static int getNumberLiked (int a,int sum,int n) {
		if (n>0) {
			sum+=(a/=2);
			return getNumberLiked(a*3, sum, --n);
		}
		return sum;
	}
}
