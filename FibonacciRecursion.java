public class FibonacciRecursion {
  
  private static int fib_n1=0;
  private static int fib_n2=1;
  
  public static void main (String[] args) {
    System.out.println(fib_n1+"\n"+fib_n2);
    printFibonacci(10);
  }
  
  public static void printFibonacci (int count) {
    if (count-2>0) {
      System.out.println(fib_n1+fib_n2);
      int n3=fib_n1+fib_n2;
      fib_n1=fib_n2;
      fib_n2=n3;
      printFibonacci(--count);
    }
  }
}
