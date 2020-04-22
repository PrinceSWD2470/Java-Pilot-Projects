import java.util.Scanner;

class Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cup = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        if (cup > 10 && cup < 20 && weekend != true || cup > 15 && cup < 25 && weekend == true) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}
