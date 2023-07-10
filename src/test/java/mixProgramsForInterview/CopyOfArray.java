package mixProgramsForInterview;

public class CopyOfArray {

	public static void main(String[] args) {
		int a[]= {2,8,5,6,3,9};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		for(int x:b) {
			System.out.print(x+" ");

		}
	}

}
