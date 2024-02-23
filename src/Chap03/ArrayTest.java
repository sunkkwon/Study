package Chap03;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] nums = {10,20,30,40,50};
		int ii=0;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("num[" + i + "]: " + nums[i]);
		}
		
		System.out.println("");

		for(int n : nums) {
			System.out.println("num[" + ii++ + "]: " + n);
		}
	}

}
