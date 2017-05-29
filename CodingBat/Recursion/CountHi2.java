public class CountHi2 {
  public static void main (String... args) {
    // Result: 1.
    System.out.println (new CountHi2 ().countHi2 ("ahixhi"));
  }
  
  public int countHi2 (String str) {
    return str.equals("")||str.indexOf ("hi")==-1?0:(!str.substring(0,str.indexOf ("hi")).contains ("x")||str.indexOf ("xhi")==-1?1+countHi2 (str.substring(str.indexOf("hi")+2)):countHi2 (str.substring(str.indexOf("hi")+2)));
  }
}
