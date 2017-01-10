import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int counter=0;
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int[] b = new int[m];
	        for(int b_i=0; b_i < m; b_i++){
	            b[b_i] = in.nextInt();
	        }
	        Arrays.sort(a);
	        Arrays.sort(b);
	        boolean flag=false;
	        for (int i=a[a.length-1];i<=b[0];i++) {
	        	for (int j=0;j<a.length;j++) {
	        		if (i%a[j]==0)
	        			if (j==a.length-1) flag=true;
	        			else continue;
	        		else break;
	        		if (flag) {
	        			for (int k=0;k<b.length;k++) {
	        				if (b[k]%i==0) {
	        					if (k==b.length-1)
	        						counter++;
	        					else
	        						continue;
	        				} else {
	        					break;
	        				}
	        			}
	        		}
	        	}
	        }
	        System.out.println(counter);
    }
}
