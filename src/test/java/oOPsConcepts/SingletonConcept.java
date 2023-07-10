package oOPsConcepts;

public class SingletonConcept {
	 int x=50;
	static int i=0;
	private SingletonConcept(){
		System.out.println("hii");
	}
	public static SingletonConcept getConst() {
		i++;
		if(i==1) {
			SingletonConcept s=new SingletonConcept();
			return s;
		}
		else
			return null;
	}
}
class ChildSingletonConcept{
	public static void main(String[] args) {
		SingletonConcept c=SingletonConcept.getConst();
		int z=c.x;
		System.out.println(z);
	}

}
