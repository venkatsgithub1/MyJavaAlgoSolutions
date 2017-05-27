public class AllStar {
  public static void main (String... args) {
    //Result: h*e*l*l*o
    System.out.println(allStar("hello"));
  }
  
  public String allStar(String str) {
    int lastStar=str.lastIndexOf("*");
	  return (str.length()==0 || lastStar==str.length()-2)?str:allStar(str.indexOf("*")==-1?str.charAt(0)+"".concat("*").concat(str.substring(1)):str.substring(0,lastStar+1).concat(""+str.charAt(lastStar+1)).concat("*").concat(str.substring(lastStar+2)));
  }
}
