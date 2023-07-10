package oOPsConcepts;

public class InheritanceConcept {
	int rollNo=20;
	String name="Swarna";
	static String state="Odisha";
	public void m() {
		System.out.println("hii hello bye bye");
	}
	public static void n() {
		System.out.println("welcome to India");
	}
}

class Child extends InheritanceConcept{
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.rollNo);
		System.out.println(c.name);
		System.out.println(state);
		n();
		c.m();

	}

}
