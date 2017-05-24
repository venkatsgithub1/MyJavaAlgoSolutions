public class Array11 {
  public static void main (String... args) {
    // Result: 1.
    System.out.println(new Array11().array11(new int []{2,6,11},0));
  }
  
  public int array11(int[] nums, int index) {
	  return (nums.length==0||index==nums.length)?0:((nums[index]==11)?1+array11(nums, ++index):array11(nums,++index));
  }
}
