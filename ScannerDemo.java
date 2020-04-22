import java.util.*;
class ScannerDemo {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		/**
		* this programe will get 4 integers as input and print them on new line
		*/
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		System.out.print(a + "\n" + b + "\n" + c + "\n" + d);
	}
}