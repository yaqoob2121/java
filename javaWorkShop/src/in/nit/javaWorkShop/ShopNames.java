package in.nit.javaWorkShop;

public class ShopNames {

	public static void main(String[] args) {
		//for loop
		for(int number=0; number<5; number++) {
			System.out.println(number);
		}
		System.out.println("Reverse");
		for(int number=4; number>=0;number--) {
			System.out.println(number);
		}
		//declare array
		String ShopNames[] = {"clothsshop","vegetableshop","coffeeshop","booksshop","TVshop"};
		for(int index = 0; index < ShopNames.length; index++ ) {
			System.out.println(ShopNames[index]);
			}
		
		System.out.println("reverse of array elements");
		for(int index=4; index>=0; index--) {
			System.out.println(ShopNames[index]);
			
		}
			System.out.println("reverse of array elements");
			for(int index =ShopNames.length-1; index>=0; index--) {
				System.out.println(ShopNames[index]);
				
			}
			
	}
}
