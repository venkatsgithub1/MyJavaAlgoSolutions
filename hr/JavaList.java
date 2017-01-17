import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n=in.nextInt();
        for (int i=0;i<n;i++) list.add(in.nextInt());
        int q=in.nextInt();
        for (int i=0;i<q;i++) {
            String operation=in.next();
            if (operation.equals("Insert")) list.add(in.nextInt(), in.nextInt());
            else if (operation.equals("Delete")) list.remove(in.nextInt());
        }
        for (int a:list) System.out.print(a+" ");
    }
}
