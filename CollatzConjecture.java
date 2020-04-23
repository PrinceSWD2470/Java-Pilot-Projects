import java.util.*;
class CollatzConjecture {
	public static void main(String[] arg) {

		/**
		* how this program works?
		* this programe gets one input if it is odd the  continue series with dividing it upto 1 else multiply it with 3
		*/
		System.out.println("This program will print Collatz conjecture series by giving one input: try and Analyse it Your will get Idea about Collatz Series, It Always ends at 1");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Collatz Conjecture number : ");
		int n = scanner.nextInt();
		while (n > 1) {
			System.out.print(n + "\t");
			if (n % 2 == 0) {
				n = n / 2;
			}else {
				n = n * 3 + 1;
			}
		}
		if (n <= 0) {
			System.out.print("This is not Collatz Series Number");
		} else {
			System.out.print(n);
		}
	}
}