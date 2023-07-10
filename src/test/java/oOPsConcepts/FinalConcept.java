package oOPsConcepts;
final public class FinalConcept {
	final int X;
//	final static char C='c';
	
	{	X=20;	}

	final static String S;
	static {	S="Swarna";	}

	public static void main(String[] args) {
		final int I;
		FinalConcept f=new FinalConcept();
		System.out.println(f.X);
		System.out.println(S);
		I=100;
		System.out.println(I);		
//		C='d';
	}
}
class ChildFinal{
	public static void main(String[] args) {
		FinalConcept f=new FinalConcept();
		System.out.println(f.X);
	}
}
