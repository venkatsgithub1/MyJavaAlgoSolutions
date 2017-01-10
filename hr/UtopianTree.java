import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            if (n==0) System.out.println(1);
            else {
                int sum=0;
                int condition=n%2==0?(n/2):n/2+1;
                for (int i=1;i<=condition;i++) {
                    sum+=(int)Math.pow(2,i);
                }
                if (n%2!=0) System.out.println(sum);
                else System.out.println(sum+1);
                sum=0;
            }
        }
    }
}
