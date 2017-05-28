public class CountAbc {
  public static void main (String... args) {
    //Result:2.
    System.out.println(new CountAbc ().countAbc ("abcxxxabc"));
  }

  public int countAbc (String str) {
    return str.length () < 3?0:(str.substring (0,3).equals("abc")||str.substring (0,3).equals("aba")?1+countAbc (str.substring(1)):countAbc (str.substring(1)));
  }
}
