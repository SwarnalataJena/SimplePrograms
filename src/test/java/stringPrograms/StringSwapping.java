package stringPrograms;

public class StringSwapping {

	public static void main(String[] args) {
		String s1="Welcome";
		String s2="Namaste";
		System.out.print(s1+" ");
		System.out.println(s2);

		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s1.length()-s2.length());
		System.out.print(s1+" ");
		System.out.println(s2);

		
	}

}
//s1=WelcomeNamaste