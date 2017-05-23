public class ChangePi {
  public static void main (String args[]) {
    // Result: 3.14sajdfasfasfsdfasf3.14
    System.out.println(new ChangePi ().changePi ("pisajdfasfasfsdfasf3.14"));
  }
  
  public changePi (String str) {
    return (!str.contains("pi"))?str:changePi(str.replace("pi", "3.14"));
  }
}
