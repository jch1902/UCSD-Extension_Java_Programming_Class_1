
public class Computer {
	private int accumulator;
	private int[] memory = new int[16];
	
	//Computer instructions
	public static final int LOAD = 10;//by making these static, 
	public static final int ADD = 11;//they're accessible all the time
	public static final int STORE = 12;
	
	public int getMemorySize() {
		return memory.length;
	}
	public boolean loadMemory(int[] memory)	{
		//Verify memory size not too big
		if(memory.length > this.memory.length) {
			//TODO Maybe throw an exception in
			return false; //Memory did not load
		}
		//Copy memory into the computer
		System.arraycopy(memory, 0, this.memory, 0, memory.length);
		return true;
	}
	public boolean run() {
		int program_counter = 0;
		boolean program_running = true;
		while(program_running) {
			//Get next instructions
			int instruction = memory[program_counter];
			switch(instruction) {
			case Computer.LOAD:
				program_counter++;//Point to argument for read
				accumulator = memory[program_counter];
				program_counter++;//points to next instruction
				break;
			case Computer.ADD:
				program_counter++;//Point to argument for add
				accumulator += memory[program_counter];
				program_counter++;//Points to next instruction
				break;
			case Computer.STORE:
				program_counter++;//Point to address to store
				int memory_address = memory[program_counter];
				//Store results
				memory[memory_address] = accumulator;
				program_counter++;//Point to next instruction
				break;
			default: //If no instructions, then end program
				program_running = false;
			}
		}
		return true; 
	}
	public boolean readMemory(int[] memory) {
		//TODO error checking
		System.arraycopy(this.memory, 0, memory, 0, this.memory.length);
		return true;
	}
}
