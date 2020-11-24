
public class Main {

	public static void main(String[] args) {
		
		//int[] numbers = {-2,1,-3,4,-1,2,1,-5,4};
		int[] numbers = {-2147483647};
		int sum = 0;
		int highest = Integer.MIN_VALUE;
		
		int start = 0;
		int finish = start + 1;
		
		
		
		while(start < numbers.length) {
			for(int i = start; i < numbers.length; i++) {
				sum = sum + numbers[i];
				
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
		
		System.out.println(highest);
		
		
		
		
	}

}
