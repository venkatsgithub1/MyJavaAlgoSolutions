public class StringClean {
  public static void main (String... args) {
    // Result:yza
    System.out.println(new StringClean ().stringClean ("yyzzza"));
  }
  
  public String stringClean (String str) {
    return str.length()<2?str:(str.charAt(0)==str.charAt(1)?stringClean (str.substring(1)):str.charAt(0)+stringClean(str.substring(1)));
  }
}
