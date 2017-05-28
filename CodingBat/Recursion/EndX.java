public class EndX {
  public static void main (String... args) {
    // Result:rexx.
    System.out.println (new EndX().endX("xxre"));
  }
  public String endX(String str) {
    return str.equals("")?str:(str.charAt(0)=='x'?endX(str.substring(1)).concat("x"):str.charAt(0)+endX(str.substring(1)));
  }
}
