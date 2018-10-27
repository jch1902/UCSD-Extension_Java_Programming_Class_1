
public class NetArrayV1 {

	public static void main(String[] args) {
		//Create an instance of an int array
		int[] array;//Reference without a value
		array = new int[3];//Allocate an object
		System.out.println(array);
		//Output the value of each item
		//NOTE: All are initialized to 0 by default
		for(int i = 1; i < array.length; i++) {
			System.out.printf("%d-%d%n", i, array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = i * i;
		}
		displayArray(array);
		
		//Second array
		int[] grades = {85,90,100,95};
		displayArray(grades);
		//Chance reference of array to reference grades
		array = grades;
		displayArray(array);
		
		// Sum all the values in the array
		int total = 0;
		for(int j = 0; j < grades.length; j++) {
			total += grades[j];
		}
		System.out.println("total: " + total);
		
		//Array of bar chart values
		int[] barValues = { 0, 2, 1, 4, 5};
		// Display index, value, and count of "*"
		for(int i = 0; i < barValues.length; i++) {
			System.out.printf("%d = %d", i, barValues[i]);
			for(int j = 1; j <= barValues[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void displayArray(int[] array) {
		System.out.println(array);
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d - %d%n", i, array[i]);
		}
		// Option 2 to display array values
		for(int i : array) {
			System.out.printf("%d%n", i);
		}
	}
}
