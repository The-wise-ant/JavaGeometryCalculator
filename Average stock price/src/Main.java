
public class Main {

    public static void main(String[] args) {

        Stock abcCompany = new Stock();

        abcCompany.buy(36.6, 2000);

        abcCompany.buy(39.7, 3000);

        abcCompany.sell(42.9, 1000);

        System.out.println("Shares Owned: " + abcCompany.getShares());

        System.out.println("Current Price: $" + abcCompany.getPrice());

        System.out.println("Average Price: $" + abcCompany.getAveragePrice());

    }
}
