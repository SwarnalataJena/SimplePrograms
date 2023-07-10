package stringPrograms;

public class CountConsonantVowel {

	public static void main(String[] args) {
		String strr="Omm Namoh Shivaya";
		String str=strr.toLowerCase();
		String s[]=str.split(" ");
		int count=0;
		int c=0;
		String res="";
		String resc="";
		for(int i=0;i<s.length;i++) {
			String s1=s[i];
			for(int j=0;j<s1.length();j++) {
				char ch=s1.charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					count++;
					res=res+ch;
				}
				else {
					c++;
					resc=resc+ch;
				}
			}
			
		}
		System.out.println(res);
		System.out.println("Number of vowels are "+count);
		System.out.println(resc);
		System.out.println("Number of consonants are "+c);
	}

}

class CountConsoVow{
	public static void main(String[] args) {
		String str="namaste";
		char ch[]=str.toCharArray();
		int c=0,v=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				v++;
			}
			else {
				c++;
			}
		}
		System.out.println("vowel "+v);
		System.out.println("Consonant "+c);
	}
}
