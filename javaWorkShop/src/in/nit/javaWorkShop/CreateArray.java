package in.nit.javaWorkShop;

public class CreateArray {

	public static void main(String[] args) {
		String BrandName[] = { "kia", "honda", "toyota", "swift", "nano" };
		for (int index = 0; index < BrandName.length; index++) {
			System.out.println(BrandName[index]);
		}
		
		//reverse
		
			
		
		System.out.println("reverse of array elements");
		for(int index=4; index>=0; index--) {
			System.out.println(BrandName[index]);
			}
		
		
		System.out.println("BrandName:"+BrandName.length);
		
		
		
	}		
}
