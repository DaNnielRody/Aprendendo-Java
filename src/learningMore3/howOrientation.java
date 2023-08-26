package learningMore3;
import java.util.Locale;
import java.util.Scanner;
// import static learningMore3.Currency.*; com a instanciação da classe, não é mais necessário importá-la

public class howOrientation {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double currencyPrice = scanner.nextDouble();

        System.out.println("How many dollares will be bought?");
        double quantity = scanner.nextDouble();

        Currency currency = new Currency(currencyPrice, quantity); // chamo o currency para poder acessar seus atributos.

        double total = currency.currencyConverter(); // através da instância, consigo acessar a classe sem ter que usar, necessariamente, métodos estáticos para ela.

        System.out.printf("Amount to be paid in reais = %.2f", total);

        scanner.close();
    }
}
