import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
	//Create an instance of Scanner
		Scanner in = new Scanner(System.in);
	//Prompt for service rating
		String msg = "How was your service?";
		String msg2 = "Select 1 to 5";
		String msg3 = "(1 is low, 5 is high)";
		
		System.out.printf("%s%n%s%n%s%n", msg, msg2, msg3);
	//Prompt for choice
		int rating = 0;
		boolean noValidRating = true;
		do {
			System.out.print("Enter rating: ");
			rating = in.nextInt();
			if(rating >=1 && rating <= 5) {
				noValidRating = false;
			}else if(rating > 1) {
				System.out.println("Rating too low");
			}else {
				System.out.println("Rating too high");
			}
			
		}while(noValidRating);
		System.out.printf("Rating was %d%n", rating);
		
		
	//Demo using if else 
		String ratingMessage = " ";
		if(rating == 5) {
			ratingMessage = "Excellent";
		}else if(rating == 4) {
			ratingMessage = "Good";
		}else if(rating == 3) {
			ratingMessage = "Average";
		}else if(rating == 2) {
			ratingMessage = "Needs Improvement";
		}else {
			ratingMessage = "Very bad";
		}
		System.out.println(ratingMessage);
		
		
	//Demo using switch
		switch(rating) {
		case 5:
			ratingMessage = "Excellent";
			break;//break out of this switch statement
		case 4:
			ratingMessage = "Good";
			break;
		case 3:
			ratingMessage = "Average";
			break;
		case 2:
			ratingMessage = "Needs Improvement";
			break;
		case 1:
			ratingMessage = "Very bad";
			break;
		}
	}

}
