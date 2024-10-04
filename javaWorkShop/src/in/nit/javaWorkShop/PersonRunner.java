package in.nit.javaWorkShop;

public class PersonRunner {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Person.country = "india";
		System.out.println("country is:"+Person.country);
		Person.state = "karnataka";
		System.out.println("state is:"+Person.state);
		Person person = new Person();
		
		//object creation
		person.personName = "mohammed yaqoob";
		person.personqualification = "BE";
		person.personpanCard = "123c566a5";
		person.personAadharCardNumber = 123456789034l;
		System.out.println("personName:"+person.personName);
		System.out.println("Qualification:"+person.personqualification);
		System.out.println("pan card:"+person.personpanCard);
		System.out.println("Aadhard card:"+person.personAadharCardNumber);
		
		//static method
		Person.displayInfo();
		person.getInformation();
		  
		
		//problems
		
			
		}


		
		
		}

