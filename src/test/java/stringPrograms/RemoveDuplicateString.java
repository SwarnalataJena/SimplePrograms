package stringPrograms;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String str="go to your home your mother is calling you";
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++) {
			int count=0;
			for(int j=0;j<s.length;j++) {
				if(s[i].equals(s[j])&&s[i].length()>s[j].length()) {
					break;
				}
				if(s[i].equals(s[j])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(s[i]+" ");	
			}
		}
	}

}
