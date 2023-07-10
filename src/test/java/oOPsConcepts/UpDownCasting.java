package oOPsConcepts;

public class UpDownCasting {
	public void m1() {
		System.out.println("empty");
	}
	public void m1(int c) {
		System.out.println("parent");
	}
	public void m1(String name) {
		System.out.println("string");
	}
}
class ChildUpDownCasting extends UpDownCasting{
	public void m1(int c) {
		System.out.println("This is a int in child");
	}

	public static void main(String[] args) {
		UpDownCasting t=new ChildUpDownCasting();
		t.m1();
		t.m1(25);
		t.m1("swarna");
		ChildUpDownCasting x=(ChildUpDownCasting)t;
		x.m1();
		x.m1(20);
		x.m1("addi");
		
			
	}

}
