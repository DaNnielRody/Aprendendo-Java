package learningMore2;

import java.util.Locale;

public class howOrientatiation {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        System.out.println("Digite o nome do produto: ");
        String productName = InputHelper.SCANNER.nextLine();

        System.out.println("Digite o preço do produto: ");
        double productPrice = InputHelper.SCANNER.nextDouble();

        System.out.println("Digite a quantidade dele no estoque: ");
        int productQuantity = InputHelper.SCANNER.nextInt();

        Produto product = new Produto(productName, productPrice, productQuantity);

        product.showResult(); // mesmo sendo uma classe estática, ele consegue atribuir os métodos que não são estáticos através da instância dele. como chamamos o product, tudo dentro dele poderá ser usado, independente de ser estático ou não
        product.addProduct();
        product.removeProduct();
        product.showResult();

        InputHelper.SCANNER.close(); // o close tem que ser no final de todas as saídas.
    }
}