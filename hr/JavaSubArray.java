import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
		int n=in.nextInt(), counter=0, arr[] = new int [n];
		for (int i=0;i<n;i++) { 
			if ((arr[i]=in.nextInt())<0) counter++; 
		}
		for (int i=0;i<n;i++) {
			int sum=arr[i];
			for (int j=i+1;j<n;j++) {
				sum+=arr[j];
				if (sum < 0) counter++;
			}
		}
		System.out.println(counter);
    }
}
