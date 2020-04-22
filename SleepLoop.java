import java.util.Scanner;
class SleepLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter The End Value : ");
        int end = scanner.nextInt();

	System.out.println();
	System.out.print("Enter Sleep Time Seconds : ");
	int sleepSeconds = scanner.nextInt();
	
	final long start = System.currentTimeMillis() / 1000;//starting time of program

        for (int i = 0; i <= end; i++) {
		System.out.print(i + "\t");

		try {
   			 Thread.sleep(sleepSeconds * 1000);
		} catch (InterruptedException ie) {
    			Thread.currentThread().interrupt();
		}


	}
	System.out.println();
	final double runningTime = System.currentTimeMillis() / 1000 - start; // get the time which consumed by programe.
	String.format("%09f", runningTime);
	System.out.print(runningTime);
   }
}