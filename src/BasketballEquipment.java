import java.util.Scanner;
public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceOfTrainingForTheYear = Integer.parseInt(scanner.nextLine());

        double priceForShoes = priceOfTrainingForTheYear * 0.60;
        double priceForClothes = priceForShoes * 0.80;
        double priceForBall =  priceForClothes * 1/4;
        double priceForAccessories = priceForBall * 1/5;

        double sum = priceForShoes + priceForClothes + priceForBall + priceForAccessories + priceOfTrainingForTheYear;

        System.out.println(sum);
    }
}