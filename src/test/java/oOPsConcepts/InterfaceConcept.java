package oOPsConcepts;

public interface InterfaceConcept {
	int x=50;
	void m();
}
interface InterfaceConcept1{
	void m2();
}

class ChildInterfaceConcept implements InterfaceConcept, InterfaceConcept1{
	public void m() {
		System.out.println("Hii I am getting implemented in class and method m()");
	}
	public void m2() {
		System.out.println("Hii I am getting implemented in class and method m2()");

	}
	public static void main(String[] args) {
		ChildInterfaceConcept c=new ChildInterfaceConcept();
		c.m();
		c.m2();
	}
}
