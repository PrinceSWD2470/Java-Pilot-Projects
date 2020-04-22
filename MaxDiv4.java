import java.util.*;
class MaxDiv4 {
	public static void main(String[] arg) {
		System.out.println("This programe provide us maximum number which is divisble with 4 and run upto we specified in count....");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Counts : ");
		int countSequence = scanner.nextInt();
		int max = 0;
		int i = 1;
		while (i <= countSequence) {
			System.out.print("Value " + i + " : ");
			int num = scanner.nextInt();
			if (num % 4 == 0 && num > max) {
				max = num;
			}
			i++;
		}
		if (max <= 0) {
			System.out.println("These is Nothing which can be divisible with 4");
		} else {
			System.out.print("Maximum Number and Divisible with four From Provided inputs is : " + max);
		}
	}
}