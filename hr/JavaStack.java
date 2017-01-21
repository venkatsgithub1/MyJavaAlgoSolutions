import java.util.*;
class JavaStack{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
       int arr[]=new int[6];
      
      while (sc.hasNext()) {
         String input=sc.next();
         char chArr[]=input.toCharArray();
         for (char ch:chArr) {
             if (ch==40) arr[0]++;
             else if (ch==41) arr[1]++;
             else if (ch==123) arr[2]++;
             else if (ch==125) arr[3]++;
             else if (ch==91) arr[4]++;
             else if (ch==93) arr[5]++;
         }
         if (arr[0]==arr[1]&&arr[2]==arr[3]&&arr[4]==arr[5]) System.out.println("true");
         else System.out.println("false");
          arr=new int[6];
      }
   }
}
