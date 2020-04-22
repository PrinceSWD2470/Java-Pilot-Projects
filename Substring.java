import java.util.Scanner;
class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        String str = scanner.next();
        String s2 = str.substring(startRange, endRange);
        System.out.print(s2);
    }
}