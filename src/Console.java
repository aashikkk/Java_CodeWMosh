import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt){
        return scanner.nextDouble();
    }
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();   // p
            if (value < max && value > min)
                break;

            System.out.println("Enter a number between " + min + " and " + max);
        }
        return value;
    }
}

// we don't need to expose Scanner class here, so hide the implementation details by making private.
// also make static to use in both static methods
