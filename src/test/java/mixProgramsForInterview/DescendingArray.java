package mixProgramsForInterview;

public class DescendingArray {

	public static void main(String[] args) {
		int a[]= {2,8,3,6,5,1,9};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
			System.out.print(a[i]+" ");

		}
	}

}
