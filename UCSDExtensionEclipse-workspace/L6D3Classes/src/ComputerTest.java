
public class ComputerTest {

	public static void main(String[] args) {
		//create a computer program using machine language
		int[] program = {Computer.LOAD, 100, 
				Computer.ADD, 200, Computer.STORE, 10};
		
		
		//executing the program
		Computer computer1 = new Computer();
		computer1.loadMemory(program);
		computer1.run();
		int[] results = new int[computer1.getMemorySize()];
		computer1.readMemory(results);
		//if all goes well, location 10 in memory will have result
		System.out.println("Results[10]: " + results[10]);
	}

}
