import java.util.Scanner;
class EvenNumber{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int ans = num % 2;
		if(ans == 0){
			System.out.print( num + 2 );
		}else{
			System.out.print( num + 1 );
		}
	}
}