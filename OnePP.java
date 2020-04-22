import java.util.Scanner;

class OnePP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        if ((num1 < 0 && num2 >= 0 && num3 >= 0) || (num1 >= 0 && num2 < 0 && num3 >= 0) || (num1 >= 0 && num2 >= 0 && num3 < 0)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
        
    }
}
