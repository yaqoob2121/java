package java_xworkz;

public class Subject {

	// properties of subject
	public String SubjectName;
	public String SubjectCode;

	// constructor
	public Subject() {
		System.out.println("default constructor");
	}

	// instance methods
	public void getSubjectDetails() {
		System.out.println("this is getSubjectDetails");
	}

	public void getSubjectDetails(String SubjectName) {
		System.out.println("this is getSubjectDetails method");
		System.out.println("subjectName:" + SubjectName);

	}
	public void getSubjectDetails(String SubjectName,String SubjectCode) {
		System.out.println("this is getSubjectDetails");
		System.out.println("subjectName:" + SubjectName);
		System.out.println("this is getSubjectDetails");
		System.out.println("subjectcode:" + SubjectCode);
		}
       
	//to get length of given subject
	public void NumberOfChar(String SubjectName) {
		System.out.println("finding the char count");
		System.out.println(" the count is:"+SubjectName.length());
	}
	public void NumberOfChar(String SubjectName,String SubjectCode) {
		System.out.println("finding the char count");
		System.out.println(" the count is:"+SubjectName.length());
		System.out.println("the count is:"+SubjectCode.length());
	}
	
	//get the word count
	public void getNumberOfWords(String sentence) {
		System.out.println("sentence is:"+sentence);
		String words[] = sentence.split(" ");
		System.out.println("word count is:"+words.length);
	}
	

}
