package oOPsConcepts;

public class CompileTimePoly {
//	public void m1(char ch) {
//		System.out.println("char");
//	}
	public void m1() {
		System.out.println("empty");
	}
	public void m1(int c) {
		System.out.println("int");
	}
	public void m1(String name) {
		System.out.println("string");
	}
	public static void main(String[] args) {
		CompileTimePoly t=new CompileTimePoly();

//		t.m1(65);
		t.m1("addi");
		t.m1();
		t.m1('c');
	}

}
