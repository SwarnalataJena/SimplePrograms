package stringPrograms;

public class RemoveDuplicatechar {

	public static void main(String[] args) {
		String str="nagamani";
		char c[]=str.toCharArray();
		String res="";
		for(int i=0;i<c.length;i++) {
			
			if(res.indexOf(c[i])==-1) {
				res=res+str.charAt(i);
				
			}
		}
		System.out.println(res);

	}

}
