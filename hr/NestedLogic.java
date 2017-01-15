import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NestedLogic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int da=in.nextInt(), ma=in.nextInt(), ya=in.nextInt(), de=in.nextInt(), me=in.nextInt(), ye=in.nextInt(), fine=0;
        if (ya==ye) {
            if (ma==me) {
                fine=(da-de)*15;
            } else if (ma>me) {
                fine=(ma-me)*500;
            }
        } else if (ya>ye) {
            fine=10000;
        }
        System.out.println(fine);
    }
}
