package numberPrograms;

public class FactorialOfNum {

	public static void main(String[] args) {
		int num=8, mul=1;
		for(int i=num;i>=1;i--) {
			mul=mul*i;
		}
		System.out.println(mul);
	}

}
