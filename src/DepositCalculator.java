import java.util.Scanner;
public class DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int depositExpirationMonths = Integer.parseInt(scanner.nextLine());
        double yearlyInterestPercent = Double.parseDouble(scanner.nextLine());

        double interest = deposit * (yearlyInterestPercent / 100) ;
        double interestForMonth = interest / 12;
        double sum = deposit + depositExpirationMonths * interestForMonth;

        System.out.println(sum);
    }
}
