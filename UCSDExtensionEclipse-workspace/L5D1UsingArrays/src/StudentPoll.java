
public class StudentPoll {

	public static void main(String[] args) {
		boolean error = false;
		
		int []responses = {1,2,5,3,1,5,3,4,5,1,3,14};
		//Response was rating 1-5 and someone decided to put 14 
		int[] frequency = new int[6];
		//Count frequency of each response
		for(int answer = 0; answer < responses.length; answer++) {
			try{//Try it out to see if it works, else catch the error
				++frequency[responses[answer]];
			}
			catch(ArrayIndexOutOfBoundsException e) {
				error = true;
				System.out.println(e.toString());
			}
		}
		System.out.printf("%s%10s%n","Rating","Frequency");
		for(int rating = 1; rating < frequency.length; rating++) {
			System.out.printf("%6d%10d%n", rating,frequency[rating]);
		}
		if (error == true){
			System.out.println("HALT! You have inputed an invalid value!");
			
		}

	}

}
