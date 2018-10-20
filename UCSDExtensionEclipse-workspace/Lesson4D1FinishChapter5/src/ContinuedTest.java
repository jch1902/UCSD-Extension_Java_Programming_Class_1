
public class ContinuedTest {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			
			if( i == 5) {
				continue;
			}
			System.out.printf("%d", i);
		}
		System.out.println();
		System.out.println("All done");

	}

}
