package in.nit.java_workshop;

public class runner {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		   userDetails basavaraj = new userDetails();
		   System.out.println("user details:"+basavaraj);
		   basavaraj.userId =10;
		   basavaraj.username= "basarajBhai";
		   basavaraj.password = "basraj10";
		   basavaraj.age = 22;
		   basavaraj.DOB = "10th june 2002";
		   basavaraj.gender = " male";
		   System.out.println("user id:"+basavaraj.userId );
		   System.out.println("user name:"+basavaraj.username);
		   System.out.println("password:"+basavaraj.password);
		   System.out.println("age:"+basavaraj.age);
		   System.out.println("DOB"+basavaraj.DOB);
		   System.out.println("gender:"+basavaraj.gender);


		   
		}

}
              