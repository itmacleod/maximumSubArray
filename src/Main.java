
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
				
				System.out.println("Sum is " + sum);
				
				if(sum > highest) {
					highest = sum;
				}
				
				System.out.println("highest is " + highest);
				System.out.println("");
				
			}
	
			start++;
			sum = 0; 
		}
		
		return highest;
	}

}
