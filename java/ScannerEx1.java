import java.util.*;

class ScannerEx1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type double digits integer. >");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("Number : " +input);
        System.out.printf("num = %d%n", num);

        System.out.print("Type double digits integer. >");
        num = scanner.nextInt();

        System.out.println("Number : " +num);
        System.out.printf("num = %d%n", num);
    }
}