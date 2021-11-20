import java.util.Scanner;
public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPencilPackets = Integer.parseInt(scanner.nextLine());
        int countMarkerPackets = Integer.parseInt(scanner.nextLine());
        int litersBoardCleaningAgent = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pencilPrice = countPencilPackets * 5.8;
        double markerPrice = countMarkerPackets * 7.20;
        double cleaningAgentPrice = litersBoardCleaningAgent * 1.20;
        double discount = (percentDiscount * 1.0) / 100;
        double sumAllMaterials = pencilPrice + markerPrice + cleaningAgentPrice;
        double discountSum = sumAllMaterials * discount;
        System.out.println(sumAllMaterials - discountSum);
    }
}