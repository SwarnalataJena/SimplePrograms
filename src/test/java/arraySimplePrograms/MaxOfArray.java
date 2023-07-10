package arraySimplePrograms;

public class MaxOfArray {

	public static void main(String[] args) {
		int a[]= {2,8,9,3,10,5,82,195,95,108};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
