public class StrCount {
  public static void main (String args[]) {
    // Result: 2.
    System.out.println (new StrCount ().strCount ("catcowcat", "cat"));
  }
  
  public int strCount(String str, String sub) {
    return str.equals ("")||!str.contains (sub)?0:1+strCount (str.substring (str.indexOf (sub)+sub.length()),sub);
  }
}
