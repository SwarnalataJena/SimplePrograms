package arraySimplePrograms;

public class SumAvgOfArray {

	public static void main(String[] args) {
		int a[]= {2,5,8,9,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		int avg=sum/a.length;
		System.out.println("Average of the given array is "+avg);
	}

}
