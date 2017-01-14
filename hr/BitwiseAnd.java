import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BitwiseAnd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int finalNum = 0;
			for (int i = 1; i < n; i++) {
				for (int j = i + 1; j <= n; j++) {
					int andOp = i & j;
					if (andOp < k && andOp > finalNum) {
						finalNum = andOp;
					}
				}
			}
			System.out.println(finalNum);
		}
    }
}
