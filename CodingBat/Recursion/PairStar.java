public class PairStar {
  public static void main (String... args) {
    // Result:hel*lo
    System.out.println(new PairStar ().pairStar("hello"));
  }
  
  public String pairStar(String str) {
    String temp="";
	  if (str.length()==0||str.length()==1) return str;
	  temp=str.substring(0,1);
	  if (str.charAt(0)==str.charAt(1)) str=(""+str.charAt(0)).concat("*").concat(str.substring(1));
	  str=str.substring(1);
	  return temp+pairStar (str);
  }
}
