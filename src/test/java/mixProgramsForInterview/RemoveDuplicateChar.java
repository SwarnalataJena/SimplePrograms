package mixProgramsForInterview;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str="narayan";
		char ch[]=str.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++) {
			if(res.indexOf(ch[i])==-1) {
				res=res+ch[i];
			}
		}
		System.out.println(res);

	}

}
