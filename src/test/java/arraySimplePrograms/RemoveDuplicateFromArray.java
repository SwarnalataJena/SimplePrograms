package arraySimplePrograms;


public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int a[]= {2,5,8,9,6,2,3,4,5,6,7,8,9,1,2,5};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]&&i>j) {
					break;
				}
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]+" "+"came "+count+" times");
			}

		}
	}

}
