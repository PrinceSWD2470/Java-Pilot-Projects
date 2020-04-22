import java.util.Scanner;

class Desk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int student = group1 + group2 + group3;
        
        int rem = student % 2;
        
        int desk = student / 2 + rem;
        
        System.out.print(desk);
    }
}
