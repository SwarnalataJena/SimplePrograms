package oOPsConcepts;

public class RunTimePoly {
	public void m1() {
		System.out.println("empty");
	}
	public void m1(int c) {
		System.out.println("int");
	}
	public void m1(String name) {
		System.out.println("string");
	}
}
class RunPolyChild extends RunTimePoly{
	public void m1(String name) {
		System.out.println("This is a string in the child class");
	}
	public static void main(String[] args) {
		RunPolyChild r=new RunPolyChild();
		r.m1("swarna");
		r.m1(50);
	}

}
