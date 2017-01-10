import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
	        int n = in.nextInt(),counter=0;
	        int c[] = new int[n];
	        for(int c_i=0; c_i < n; c_i++){
	            c[c_i] = in.nextInt();
	        }
	        Arrays.sort(c);
	        for (int i=0;i<c.length-1;i++) {
	        	if (c[i]==c[i+1]) {
	        		counter++;
	        		i++;
	        	}
	        }
	        System.out.println(counter);
    }
}
