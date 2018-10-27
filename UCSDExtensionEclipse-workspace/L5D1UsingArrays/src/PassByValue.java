
public class PassByValue {

	public static void main(String[] args) {
		System.out.println("Pass by value");
		int count = 123;
		System.out.println(count);
		passByValue(count);
		System.out.println(count);

	}

	private static void passByValue(int count) {
		System.out.println("passByValue: " + count);
		count++;
		System.out.println("passByValue: " + count);
	}

}
