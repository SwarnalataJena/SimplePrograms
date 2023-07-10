package numberPrograms;

public class StrongNumber {

	public static void main(String[] args) {
		int num=145,temp=num,sum=0;
		while(num!=0) {
			int rem=num%10,mul=1;
			for(int i=rem;i>=1;i--) {
				mul=mul*i;
			}
			sum=sum+mul;
			num/=10;

		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not Strong Number");
		}
	}

}
