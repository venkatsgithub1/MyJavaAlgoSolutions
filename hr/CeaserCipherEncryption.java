import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CeaserCipherEncryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        k-=(26*(k/26));
        char chArr[]=s.toCharArray();
		for (char ch:chArr) {
			if (ch>=65 && ch<=90) {
				ch+=k;
				if (ch<65) {
					ch+=26;
				} else if (ch>90) {
					ch-=26;
				}
			} else if (ch>=97 && ch<=122) {
				if (ch>=97 && ch<=122) {
					ch+=k;
					if (ch<97) {
						ch+=26;
					} else if (ch>122) {
						ch-=26;
					}
				}
			}
			System.out.print(ch);
		}
    }
}
