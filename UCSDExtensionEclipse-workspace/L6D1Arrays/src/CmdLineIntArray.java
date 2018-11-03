
public class CmdLineIntArray {
	 
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Please enter three arguments: " + "arraySize InitValue Increment");
			return;
		}
		//Parse the argument
		int arrayLength = Integer.parseInt(args[0]);
		int initValue = Integer.parseInt(args[1]);
		int increment = Integer.parseInt(args[2]);
		//Now use the arguments
		int[] array = new int[arrayLength];
		for(int i = 0; i < array.length; i++) {
			array[i] = initValue + increment * i;
		}
		//display results
		System.out.printf("%s%8s%n", "Index", "Value");
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8s", i, array[i]);
		}
	}

}
