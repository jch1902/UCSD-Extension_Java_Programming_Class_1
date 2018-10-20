import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean flag1 = false;
		boolean flag2 = true;
		boolean flag3 = true;
		boolean flag4 = false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What flavor do you like?");
		String flavor = input.next();
		if( flavor.equals("chocolate")) {
			System.out.println("Me too!");
		}else {
			System.out.println("Aww");
		}
		if(flag1 == true && flag2 == true) {
			System.out.println("AND checkpoint 1");
		}
		if(flag2 == true && flag3 == true) {
			System.out.println("AND checkpoint 2");
		}
		if((flag1 == true) || (flag2 == true)) {
			System.out.println("OR checkpoint 1");
		}
		if((flag1 == true) || (flag4 == true)) {
			System.out.println("OR checkpoint 2");
		}
		if(flag1 & flag2) {
			System.out.println("flag1 and flag2 are true");
		}
		if(flag1 | flag2) {
			System.out.println("flag1 or flag2 is true");
		}
		if(flag1 ^ flag2) {
			System.out.println("flag1 and flag2 are different");
		}
		if(!flag1) {
			System.out.println("not flag1");
		}
		System.out.println("flag1 " + flag1);
		System.out.println("!flag1 " + !flag1);
	}

}
