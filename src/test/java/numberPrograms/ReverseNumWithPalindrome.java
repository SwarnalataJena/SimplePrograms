package numberPrograms;

public class ReverseNumWithPalindrome {

	public static void main(String[] args) {
		int x=1441, rev=0, temp=x;
		while(x!=0) {
			int rem=x%10;
			rev=rev*10+rem;
			x/=10;
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}

}
