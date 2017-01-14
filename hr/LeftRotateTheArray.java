import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotateTheArray {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),d=in.nextInt(),intArr[]=new int[n];
        int arrSum=n-d;
        for (int i=0;i<n;i++){
            if (i+arrSum>=n) {
                intArr[i+arrSum-n]=in.nextInt();
            } else {
                intArr[i+arrSum]=in.nextInt();
            }
        }
        for (int i=0;i<n;i++) System.out.print(intArr[i]+" ");
    }
}
