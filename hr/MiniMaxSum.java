import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();*/
        List<Long> list = new ArrayList<>();
		list.add(in.nextLong());
		list.add(in.nextLong());
		list.add(in.nextLong());
		list.add(in.nextLong());
        list.add(in.nextLong());
		Collections.sort(list);
        Long totalSum=list.get(0)+list.get(1)+list.get(2)+list.get(3)+list.get(4);
        System.out.println((totalSum-list.get(4))+" "+(totalSum-list.get(0)));
    }
}
