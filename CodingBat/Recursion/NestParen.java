public class NestParen {
  public static void main (String args[]) {
    // Result: true.
    System.out.println (new NestParen ().nestParen("((()))"));
  }
  
  public boolean nestParen(String str) {
    return str.equals("")?true:(str.charAt(0)=='(' && str.charAt(str.length()-1)==')'?nestParen (str.substring (1, str.length()-1)):false);
  }
}
