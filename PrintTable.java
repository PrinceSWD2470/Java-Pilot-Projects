import java.util.Scanner;
class PrintTable {
	public static void main (String[] arg) {
		System.out.println("This program will produce table upto ten of start number to end Number");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Start of Table : ");
		int startTable = scanner.nextInt();
		System.out.println();
		System.out.print("Enter End Of Table : ");
		int endTable = scanner.nextInt();
		
		final long programStartTime = System.currentTimeMillis() / 1000;//starting time of program
		
		long iterationTime = System.currentTimeMillis() / 1000 - programStartTime;//time upto that iteratiom

		for (int i = startTable; i <= endTable; i++) {
   			 for (int j = 1; j <= 10; j++) {
       			 System.out.print(i * j + "\t");
   			 }
		iterationTime = System.currentTimeMillis() / 1000 - programStartTime;//time upto that iteratiom
		System.out.println();
		System.out.println();
		System.out.print("Time upto that iteration : " + iterationTime);

   		 System.out.println();
		System.out.println();
		}
		System.out.print("Total time consumed by Program : " + iterationTime);
	}
}