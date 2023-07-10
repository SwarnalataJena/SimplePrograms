package arraySimplePrograms;

public class AscendingSorting {

	public static void main(String[] args) {
		int a[]= {5,3,9,2,7,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");

		}
	}

}
