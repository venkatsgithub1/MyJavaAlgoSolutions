import java.util.*;
import java.io.*;

class DictionariesAndMaps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneDictionary = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneDictionary.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer phone=phoneDictionary.get(s);
            if (phone!=null) {
                System.out.println(s+"="+phone);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
