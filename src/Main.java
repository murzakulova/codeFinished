import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("сан киргизиниз");
            number = scanner.nextInt();
        } while (number != 0);
        System.out.println("код аяктады");
    }
}

