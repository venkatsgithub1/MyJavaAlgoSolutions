public class ParenBit {
  public static void main (String... args) {
    // Result: (abc).
    System.out.println (new ParenBit ().parenBit ("xy(abx)z"));
  }
  
  public String parenBit (String str) {
    return str.equals ("")?str:(str.indexOf ("(")!=0?parenBit (str.substring(1)):str.substring (0, str.indexOf (")")+1));
  }
}
