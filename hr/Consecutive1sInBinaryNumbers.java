import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Consecutive1sInBinaryNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str=Integer.toBinaryString(n);
		String strArr[]=str.split("0");
		Arrays.sort(strArr);
		System.out.println((strArr[strArr.length-1]).length());
    }
}
