package twoSum;

public class Main {

	public static void main(String[] args) {
		int target = 6;
		int max = 1000000000;
		int min = -1000000000;
		
		int[] nums = {3,2,4};
		
		if(nums.length >= 2 && nums.length <= 100000) {
			getIndices(nums, target);
		}else{
			System.out.println("nums length must be between 2 and 10^5");
		}
		
		
		
	}
	
	private static void getIndices(int[] nums, int target) {
		for(int i = 0; nums.length > i; i++) {
			for(int j = 0; nums.length > j; j++) {
				int sum = nums[i]+nums[j];
				if(sum == target) {
					System.out.println(String.format("[%d, %d]", i, j));
					return;
				}
			}
		}
		
	}

}
