import java.util.*;
class DSix {
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		System.out.println("This programe will get number of itaration to be run and provide you the sum of all numbers which will be divisible with six in your proviuded List");
		System.out.print("Enter the Number of Sequence to be get input : ");
		int num = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i < num; i++) {
			int v = scanner.nextInt();
			if (v % 6 == 0) {
				sum += v;
			}
		}
		System.out.print(sum);
	}
}