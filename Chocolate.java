import java.util.Scanner;
class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
	
	if ((k % n == 0 && k / n < m) || (k % m == 0 && k / m < n)) {
    		System.out.print("YES");
	} else {
    		System.out.print("NO");
	}

   }
}