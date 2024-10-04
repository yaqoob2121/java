package java_xworkz;

public class SubjectRunner {

	public static void main(String[] args) {
		Subject Subject1 = new Subject ();
		Subject1.getSubjectDetails();
		Subject1.getSubjectDetails("maths");
		Subject1.getSubjectDetails("basic signal processing");
		Subject1.getSubjectDetails("21EC32");
		Subject1.NumberOfChar("sunskrutikakannada");
		Subject1.NumberOfChar("Digital signal pocessing");
		Subject1.NumberOfChar("21EC42");
		Subject1.getNumberOfWords("hello this is ongoing java workshop in NIT campus");
	}

}
