public class ChangeXY {
  public static void main (String... args) {
  // Result: yyyyyyhiyyyyyyyhi
    System.out.println(new ChangeXY ().changeXY ("xxxxxxhixxxxxxxhi"));
  }
  
  public String changeXY (String str) {
    return (str.indexOf ("x")==-1)?str:changeXY(str.replace("x", "y"));
  }
}
