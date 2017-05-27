public class Array220 {
  public static void main (String... args) {
    // Result: true.
    System.out.println(new Array220().array220(new int []{1,2,20},0));
  }
  
  public boolean array220(int[] nums, int index) {
	  return (nums.length==0||index==nums.length-1)?false:((nums[index]*10==nums[index+1])?true:array220 (nums,++index));
	}
}
