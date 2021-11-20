import java.util.Scanner;
public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChikenMenu = Integer.parseInt(scanner.nextLine());
        int countFishMenu = Integer.parseInt(scanner.nextLine());
        int countVegetarianMenu = Integer.parseInt(scanner.nextLine());

        double priceChikenMenus = countChikenMenu * 10.35;
        double priceFishMenus = countFishMenu * 12.40;
        double priceVegetarianMenus = countVegetarianMenu * 8.15;

        double sumMeal = priceChikenMenus + priceFishMenus + priceVegetarianMenus;
        double priceOfDesert = sumMeal * 0.20;
        double priceForDelivery = 2.50;

        double totalSum = sumMeal + priceForDelivery + priceOfDesert;

        System.out.println(totalSum);
    }
}