package mixProgramsForInterview;

public class ReverseOfArray {

	public static void main(String[] args) {
		int a[]= {2,5,8,9,6};
		int b[]=new int [a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--) {
			b[k]=a[i];
			k++;
		}
		for(int x:b) {
			System.out.print(x+" ");
		}
	}

}
