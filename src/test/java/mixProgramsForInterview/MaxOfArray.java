package mixProgramsForInterview;

public class MaxOfArray {

	public static void main(String[] args) {
		int a[]= {2,5,8,9,6,3,1,4};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
class MinOfArray{
	public static void main(String[] args) {
		int a[]= {2,5,8,9,6,3,1,4};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
