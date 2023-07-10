package numberPrograms;

public class SumAndCountOfNum {

	public static void main(String[] args) {
		int num=1562,sum=0,count=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num/=10;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);


	}

}
