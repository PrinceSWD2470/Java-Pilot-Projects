import java.util.Scanner;
class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean n1 = a + b > c ;
	boolean n2 = a + c > b ;
	boolean n3 = b + c > a ;

	if (n1 == true && n2 == true && n3 == true) {
		System.out.print("YES");
	} else {
		System.out.print("NO");
		}

    }
}