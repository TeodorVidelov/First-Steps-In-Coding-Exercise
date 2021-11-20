import java.util.Scanner;
public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSheetsInBook = Integer.parseInt(scanner.nextLine());
        int readSheetsForHour = Integer.parseInt(scanner.nextLine());
        int countOfDaysToReadBook = Integer.parseInt(scanner.nextLine());

        int sumTimeForReading = countSheetsInBook / readSheetsForHour;
        int sumHours = sumTimeForReading / countOfDaysToReadBook;
        System.out.println(sumHours);
    }
}