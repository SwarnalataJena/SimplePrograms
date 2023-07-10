package numberPrograms;

public class PrimeNumber {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			int prime=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					prime++;
				}
			}
			if(prime==2) {
				System.out.println("Number is prime "+i);
			}
			
		}
	}

}
