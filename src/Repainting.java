import java.util.Scanner;
public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededNylonSquareMeters = Integer.parseInt(scanner.nextLine());
        int neededLitersPaint = Integer.parseInt(scanner.nextLine());
        int neededLitersThinner = Integer.parseInt(scanner.nextLine());
        int hoursTheWorkWillBeDone = Integer.parseInt(scanner.nextLine());

        double sumNylon = (neededNylonSquareMeters + 2) * 1.50;
        double sumPaint = (neededLitersPaint * 1.1) * 14.50;
        double sumThinner = neededLitersThinner * 5.0;
        double priceBag = 0.40;

        double sumMaterialss = sumNylon + sumPaint + sumThinner + priceBag;
        double workersSalary = (sumMaterialss * 0.30) * hoursTheWorkWillBeDone;

        System.out.println(sumMaterialss + workersSalary);
    }
}