public class Array6 {
  public static void main (String... args) {
    // Result: true.
    System.out.println(new Array6().array6(new int[]{1,4,6},0));
  }
  
  public boolean array6(int[] nums, int index) {
    return (nums.length==0 || (index==nums.length-1 && nums[index]!=6))?false:((nums[index]==6)?true:array6 (nums, ++index));
  }
}
