import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        int height=0;
        String word = in.next();
        for (int i=0;i<word.length();i++) {
        	int charToInt=word.charAt(i);
        	if (h[charToInt-97]>height) height=h[charToInt-97];
        }
        System.out.println(height*word.length());
    }
}
