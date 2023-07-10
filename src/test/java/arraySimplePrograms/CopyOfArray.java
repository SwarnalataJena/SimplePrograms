package arraySimplePrograms;

public class CopyOfArray {

	public static void main(String[] args) {
		int a[]= {2,5,8,9,6,3};
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i:b) {
			System.out.print(i+" ");
		}
	}

}
