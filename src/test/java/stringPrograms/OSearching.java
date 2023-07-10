package stringPrograms;

public class OSearching {

	public static void main(String[] args) {
		String str="go to your home your mother is calling you";
		//		String s=str.toLowerCase();
		String s[]=str.split(" ");
		String res="";
		for(int i=0;i<s.length;i++) {
			String s1=s[i];
			if(s1.contains("o")) {
				res=res+s1+" ";
			}
		}
		System.out.println(res+" ");
	}

}
