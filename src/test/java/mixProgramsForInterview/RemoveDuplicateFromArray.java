package mixProgramsForInterview;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int a[]= {2,5,8,9,6,3,2,1,4,5,8,6,6,9,5,3,2,1,4};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]&&i>j) {
					break;
				}
				if(a[i]==a[j]) {
					count++;
				}

			}
			if(count>=1)
				System.out.print(a[i]+" ");
		}
	}

}
