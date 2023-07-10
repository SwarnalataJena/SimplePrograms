package oOPsConcepts;

public abstract class AbstractionConcept {
	abstract public void m1();
	abstract public void m2();
	
}

class ChildAbstractionConcept extends AbstractionConcept{
	public void m1() {
		System.out.println("I am in m1 method");
	}
	public void m2() {
		System.out.println("I am in m2 method");
	}
	public static void main(String[] args) {
		ChildAbstractionConcept c=new ChildAbstractionConcept();
		c.m1();
		c.m2();
	}

}
