
public class Main {

	public static void main(String[] args) {
		

	}
	public int maxSubArray(int[] nums) {
		int sum = 0;
		int highest = Integer.MIN_VALUE;
		
		int start = 0;
		int finish = start + 1;
		
		
		
		while(start < nums.length) {
			for(int i = start; i < nums.length; i++) {
				sum = sum + nums[i];
				
				
				if(sum > highest) {
					highest = sum;
				}
				
			}
	
			start++;
			sum = 0; 
		}
		
		return highest;
	}

}
