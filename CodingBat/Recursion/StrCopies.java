public class StrCopies {
  public static void main (String... args) {
    // Result:true.
    System.out.println(new StrCopies ().strCopies ("catcowcat","cat",2));
  }
  
  public boolean strCopies(String str, String sub, int n) {
    return n==0?true:(str.equals ("")||!str.contains (sub)?false:(str.substring (0,sub.length()).equals(sub)?strCopies (str.substring (1),sub,--n):strCopies (str.substring (1),sub,n)));
  }
}
