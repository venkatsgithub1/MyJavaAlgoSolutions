//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class JavaMap{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
       Map<String, Integer> phoneDirectory = new HashMap<>();
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
          phoneDirectory.put(name, phone);
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
          Integer phone=phoneDirectory.get(s);
          if (phone!=null) System.out.println(s+"="+phone);
          else System.out.println("Not found");
      }
   }
}
