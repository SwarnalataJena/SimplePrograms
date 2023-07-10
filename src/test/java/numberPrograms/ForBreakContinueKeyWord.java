package numberPrograms;

public class ForBreakContinueKeyWord {

	public static void main(String[] args) {
for(int i=1;i<=5;i++) {
	for(int j=1;j<=2;j++) {
		System.out.println("Inside j for loop");

	}
	if(i==3) {
		break;
	}
}
	}

}
class ForContinue{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3) {
				continue;
			}
			System.out.println("Inside i for loop"+i);

		}
	}
}
