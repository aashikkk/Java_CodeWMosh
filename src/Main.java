import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message = greet("John");
        System.out.println(message);
    }

    public static String greet(String name){
        return "Hello " + name;
    }
}

//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        int principal = 0;
//        float annualInterest = 0;
//        int years  = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Principal ($1K - $1M): ");
//            principal = scanner.nextInt();   // p
//            if (principal < 1_000_000_0 && principal > 1000)
//                break;
//
//            System.out.println("Enter a number between 1,000 and 1,000,000.");
//        }
//
//        while(true) {
//            System.out.print("Annual Interest Rate: ");
//            annualInterest = scanner.nextFloat();
//            if (annualInterest > 0 && annualInterest < 30)
//                break;
//
//            System.out.println("Enter a value greater than 0 and less than 30.");
//
//        }
//        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; // r
//
//        while (true) {
//            System.out.print("Period (Years): ");
//            years = scanner.nextInt();
//            if (years > 0 && years <= 30)
//                break;
//
//            System.out.println("Enter a value between 1 and 30");
//        }
//        int numberOfPayments = years * MONTHS_IN_YEAR; // n
//
//        double mortgage = principal
//                * (monthlyInterest * Math.pow((1+ monthlyInterest), numberOfPayments)
//                / (Math.pow((1+ monthlyInterest), numberOfPayments) - 1) );
//
//        String mortgageInDollar = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage: " + mortgageInDollar);
