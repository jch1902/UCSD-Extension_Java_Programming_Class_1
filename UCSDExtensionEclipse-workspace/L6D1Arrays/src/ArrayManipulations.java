
import java.util.Arrays;

public class ArrayManipulations {
	
	private static void display(int[] array, String title) {
		System.out.println(title);
		for(int i : array) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		int[]array = {3 , 1 , 6 , 10 , 4};
		display(array, "Original Array");
		
		//Sorting the numbers to be in chronological order
		Arrays.sort(array);
		display(array, "Sorted Array");
		
		
		//Create an array filled in with a given value
		int[] filledArray = new int[5];//Fill it in with 5 numbers
		Arrays.fill(filledArray,  42);//Fill it in with the number 42
		display(filledArray, "Filled Array");
		
		//Search an array
		int location = Arrays.binarySearch(array, 4);
		display(array, "Searched array");
		
		//Compare arrays
		boolean b = Arrays.equals(array, filledArray);
		System.out.println("b: " + b);
		
		//Copy arrays
		int[] sourceArray = {1,2,3};
		int[]destArray = new int[sourceArray.length];
		for(int i = 0; i < sourceArray.length; i++) {
			destArray[i] = sourceArray[i];
			
		}
		display(destArray, "Destination Array - V1");
		System.arraycopy(sourceArray, 0, destArray, 0, sourceArray.length);
		display(destArray, "Destination Array - V2");
		
		Demo[] srcDemo = { new Demo(), new Demo(), new Demo()};
		display(srcDemo,  "srcDemos");
		Demo[] destDemos = new Demo[srcDemo.length];
		System.arraycopy(srcDemo, 0, destDemos, 0, srcDemo.length);
		display(destDemos, "destDemos");
	}
	private static void display(Demo[] srcDemo, String title) {
		System.out.println(title);
		for(Demo d : srcDemo) {
			System.out.print(d + " ");
			System.out.println();
			
		}
		System.out.println();
	}

}
