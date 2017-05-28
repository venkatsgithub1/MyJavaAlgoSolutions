public class CountPairs {
  public static void main (String... args) {
    // Result:3.
    System.out.println(new CountPairs ().countPairs ("axaxa"));
  }
  
  public int countPairs (String str) {
    return str.length()<3?0:str.substring(0,3).charAt(0)==str.substring(0,3).charAt(2)?1+countPairs (str.substring(1)):countPairs (str.substring(1));
  }
}
