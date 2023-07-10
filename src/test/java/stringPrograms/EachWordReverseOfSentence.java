package stringPrograms;

public class EachWordReverseOfSentence {

	public static void main(String[] args) {
		String str="Omm Namoh Bhagabate Basudevaya";
		String s[]=str.split(" ");
		for(int i=s.length-1;i>=0;i--) {
//		for(int i=0;i<s.length;i++) {
			String s1=s[i];
			String rev="";
			for(int j=s1.length()-1;j>=0;j--) {
				rev=rev+s1.charAt(j);
			}
			System.out.print(rev+" ");

		}

	}

}
