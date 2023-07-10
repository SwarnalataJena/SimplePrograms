package oOPsConcepts;

public class EncapsulationConcept {
	private String name="swadhin";

	public String getName() {
		return name;
	}


}
class ChildEncapsulationConcept{

	public static void main(String[] args) {
		EncapsulationConcept e=new EncapsulationConcept();

		System.out.println(e.getName());
	}

}
