package in.nit.javaWorkShop;

public class Mobile {

	public static void login(String email,String passward) {
		System.out.println("enter email to login:"+email);
		System.out.println("enter passward to login:"+passward);
	}
		
	public static void email(String MailTo,String cc,String content,String subject ) {
	    System.out.println("enter the recieving person Id:"+MailTo);
	    System.out.println("enter the cc mail:"+cc);	
	    System.out.println("enter the content to send:"+content);
	    System.out.println("enter the subject to send:"+subject);

	}

}
