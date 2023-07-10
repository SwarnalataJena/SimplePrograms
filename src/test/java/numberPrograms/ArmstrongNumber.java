package numberPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153,count=0,temp=num,sum=0,loc=num;
		while(num!=0) {
			count++;
			num/=10;
		}
		while(temp!=0) {
			int rem=temp%10,mul=1;
			for(int i=1;i<=count;i++) {
				mul=mul*rem;
			}
			sum=sum+mul;
			temp/=10;
		}
		System.out.println(sum);
		if(sum==loc) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
	}

}
