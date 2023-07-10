package numberPrograms;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		int x=10;
		int y=30;
		System.out.println(x);
		System.out.println(y);

		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
	}
}

class SwappingWithThirdVariable{
	public static void main(String[] args) {
		int x=20;
		int y=30;
		System.out.println(x);
		System.out.println(y);
		int temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println(x);
		System.out.println(y);
	}
}
