
import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		SecureRandom sr;
		sr = new SecureRandom();
		int[] frequency = new int[7];
		//Roll the die 60 million times
		//And keep count of how much each value rolled 
		for(int roll = 1; roll <= 60_000_000; roll++) {
			++frequency[1 + sr.nextInt(6)];
		}
		for (int face = 1; face < frequency.length; face++) {
			System.out.printf("%4d %10d%n", face, frequency[face]);
		}
	}

}
