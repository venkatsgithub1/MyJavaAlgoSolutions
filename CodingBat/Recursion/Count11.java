public class Count11 {
  public static void main (String... args) {
    // Result:3.
    System.out.println(new Count11().count11 ("11xx11xxxx11"));
  }
  
  public int count11 (String str) {
    return str.length()<2?0:(str.substring (0,2).equals ("11"))?1+count11(str.substring(2)):count11(str.substring(1));
  }
}
