import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<ArrayList<Integer>> arrList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int n2 = in.nextInt();
			ArrayList<Integer> arrListChild = new ArrayList<>();
			if (n2 > 0)
				for (int j = 0; j < n2; j++)
					arrListChild.add(in.nextInt());
			arrList.add(arrListChild);
		}
		int n3 = in.nextInt();
		for (int i = 0; i < n3; i++) {
			int x = in.nextInt(), y = in.nextInt();
			if (arrList.get(x - 1).size() < y)
				System.out.println("ERROR!");
			else
				System.out.println(arrList.get(x - 1).get(y - 1));
		}
    }
}
