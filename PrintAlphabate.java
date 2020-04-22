import java.util.*;
class PrintAlphabate {
	public static void main (String[] arg) {
		System.out.println("This programe will get your interest of small or capital Alphabate to print ... \n Capital A for capital Alphabate ... \n Small a for Small Alphabate ...");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your Interest : ");
		String s = scanner.next();
		char a = s.charAt(0);
		System.out.println();
		if (a == 'a') {
			while (a <= 'z') {
				System.out.print(a + "\t");
				a++;
			}
		} else {
			while (a <= 'Z') {
				System.out.print(a + "\t");
				a++;
			}
		}
	}
}