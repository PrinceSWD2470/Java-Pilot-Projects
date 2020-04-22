import java.util.Scanner;
class ScannerClassDemo{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		//Scanner scanner2 = new Scanner(System.in);

		System.out.print("Your Full Name : ");
		String name = scanner.next();
		System.out.println("Hello "+name);
		name = scanner.nextLine();
		System.out.println("Hello "+name);
	}
}