public class CountHi {
  public static void main (String args[]) {
    // Result:4
    System.out.println(new CountHi().countHi ("xxxhihihixxxhi"));
  }
  
  public int countHi (String str) {
    return (str.equals("")||str.indexOf("hi")==-1)?0:1+countHi (str.substring(str.indexOf("hi")+2));
  }
}
