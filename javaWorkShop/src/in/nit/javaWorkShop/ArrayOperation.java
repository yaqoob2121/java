package in.nit.javaWorkShop;

public class ArrayOperation {

	public static void main(String[] args) {
		//sum of array elements
		int numbers[] = {2,4,9,7,5};
		int sum = 0;
		for(int index = 0; index < numbers.length; index++) {
			sum =sum + numbers[index];
			System.out.println("sum is:"+sum);
			
		}
		for(int index = 0; index<numbers.length;index++) {
			if(numbers[index] %2==0) {
				System.out.println("it is an even number:"+numbers[index]);
			}else
			{
				System.out.println("it is an odd number:"+numbers[index]);
			}
		}
		

	}

}
