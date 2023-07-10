package stringPrograms;

public class FirstLetterUpperCase {

	public static void main(String[] args) {
		String str="omm namoh bhagabate basudevaYa";
		String s[]=str.split(" ");
		String res="";
		for(int i=0;i<s.length;i++) {
			String s1=s[i];
			res=res+s1.substring(0,1).toUpperCase();
			res=res+s1.substring(1).toLowerCase()+" ";	
			
		}
		System.out.println(res);
	}

}
