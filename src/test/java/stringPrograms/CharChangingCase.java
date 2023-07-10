package stringPrograms;

public class CharChangingCase {

	public static void main(String[] args) {
		String str="nARAYAN";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {

			if(ch[i]<='Z'&&ch[i]>='A') {
				ch[i]=(char)(ch[i]+32);

			}
			else {
				ch[i]=(char)(ch[i]-32);

			}
		}
		for(char c:ch) {
			System.out.print(c);
		}
	}

}
