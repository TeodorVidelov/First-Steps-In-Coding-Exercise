import java.util.Scanner;
public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthInCm = Integer.parseInt(scanner.nextLine());
        int widthInCm = Integer.parseInt(scanner.nextLine());
        int heightInCm = Integer.parseInt(scanner.nextLine());
        double percentOccupiedOfCapacity = Double.parseDouble(scanner.nextLine());

        int volumeOfAquarium = lengthInCm * widthInCm * heightInCm;
        double volumeOfLiters  = volumeOfAquarium * 0.001;
        double percentOccupiedSpace= percentOccupiedOfCapacity / 100;
        double neededLitres = volumeOfLiters * (1 - percentOccupiedSpace);

        System.out.println(neededLitres);
    }
}