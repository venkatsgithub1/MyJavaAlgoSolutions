import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s=new Scanner(System.in);
	        int n=s.nextInt(),k=s.nextInt(),sum=0;
	        for (int i=0;i<n;i++) if (i!=k) sum+=s.nextInt(); else s.nextInt();
	        int annasShare=sum/2;
	        int annasShareInput=s.nextInt();
	        if (annasShare==annasShareInput) System.out.println("Bon Appetit");
	        else System.out.println(annasShareInput-annasShare);
    }
}
