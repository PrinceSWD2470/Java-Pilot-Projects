import java.util.Scanner;
class CalculateSum {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("By this programe we can calculate the sum of from starting number to end number.");
		System.out.print("Enter Starting Number : ");
		long startingNumber = scanner.nextInt();

		System.out.print("Enter Ending Number : ");
		long endingNumber = scanner.nextInt();

		long sum = 0;
		
		//start time of programe
		final long startTime = System.currentTimeMillis() / 1000;

		for (long i = startingNumber; i <= endingNumber; i++) {
			sum += i;
			/*
			try{
				Thread.sleep(100);
			} catch(InterruptedException ie){
				Thread.currentThread().interrupted();
			}
			*/
		}
		System.out.println(sum);

		//time consumed by programe
		final long endTime = System.currentTimeMillis() / 1000 - startTime;
		System.out.print("Time Consumed By Programe is : " + endTime);
	}
}