
public class PassByReference {

	public static void main(String[] args) {
		System.out.println("Pass by reference");
		int[] nums = {10,20,30};
		outputNums(nums);
		changeNums(nums);
		outputNums(nums);

	}
	private static void changeNums(int[] nums) {
		nums[0] *= 2;
		nums[1] *= 2;
		nums[2]	*= 2;
	}
	private static void outputNums(int[] nums) {
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
