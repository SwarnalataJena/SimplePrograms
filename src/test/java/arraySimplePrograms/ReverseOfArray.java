package arraySimplePrograms;

public class ReverseOfArray {

	public static void main(String[] args) {
		int a[]= {2,6,8,9,4,7,3};
		int b[]=new int[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--) {
			b[k]=a[i];
			k++;
		}
		for(int i:b) {
			System.out.print(i+" ");
		}
	}

}
