public class NoX {
  public static void main (String... args) {
    // Result: abc
    System.out.println(new NoX().noX("xxxxabxxxxxcxxxx"));
  }
  
  public String noX(String str) {
    return(str.indexOf ('x')==-1)?str:str.replace("x","");
  }

}
