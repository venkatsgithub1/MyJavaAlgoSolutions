import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=in.nextInt(),j=in.nextInt(), k=in.nextInt(), counter=0;
        for (int x=i;x<=j;x++) {
            int revX=reverseNumber(x, 0);
            if (Math.abs(x-revX)%k==0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
    
    static int reverseNumber (int a, int sum) {
		if (a>0) {
			sum=sum+(a%10);
			if (a>9) {
				a/=10;
				return reverseNumber(a, sum*10);
			}
		}
		return sum;
	}
}
