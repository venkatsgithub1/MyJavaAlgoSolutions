import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases=in.nextInt();
         for (int i=0;i<testCases;i++) {
            int count=0, a = in.nextInt(),b= in.nextInt();
        if (a!=b) {
        	count+=(int)(Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a))+1);
        } else if ((""+Math.sqrt(a)).split("\\.")[1].equals("0")) ++count;
		System.out.println(count);
        }
    }
}
