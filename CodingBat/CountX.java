public class CountX {
  public static void main (String... args) {
    // Result: 0
    System.out.println(new CountX().countX("hi"));
  }

  public int countX(String str) {
    return str.equals("")?0:(str.charAt(0)=='x'?1+countX(str.substring(1,str.length())):countX(str.substring(1,str.length())));
  }
}
