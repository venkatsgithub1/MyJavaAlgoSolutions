import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java1DArrayPart2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int testCases=in.nextInt();
        for (int i=0;i<testCases;i++) {
            int n=in.nextInt(),m=in.nextInt(),arr[]=new int[n];
            for (int j=0;j<n;j++) {
                arr[j]=in.nextInt();
            }
            if(isWinnable (0, arr, m)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean isWinnable (int i, int[] arr, int m) {
        if (i<0||arr[i]==1)return false;
        if (i==arr.length-1 || i+m>arr.length-1) return true;
	arr[i]=1;
	return isWinnable (i+1, arr, m) || isWinnable (i-1, arr, m) || isWinnable (i+m, arr, m);
    }
}
