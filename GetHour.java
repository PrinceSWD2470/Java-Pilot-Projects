import java.util.Scanner;
class GetHour {
	public static void main (String[] arg) {
		System.out.println("This Program will tell about current time.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Provide 24 hour Clock : ");
		int hour = scanner.nextInt();
		hour = hour % 12;
		System.out.println();
		System.out.print("Clock in 12 Hours : " + hour);
	}
}