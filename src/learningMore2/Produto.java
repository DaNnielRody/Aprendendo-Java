package learningMore2;

import java.util.Objects;

public class Produto {
    private final String name;
    private final double price;
    private int quantity;
    private double total; // só entra no construtor aquilo que for necessário receber parâmetro. Como o total é a multiplicação de dois outros parâmetros, não é necessário.

    public Produto(String name, double price, int quantity){ // é utilizado o mesmo nome que a classe para ser seu construtor
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;
    }

    public Produto(String name, double price){ // método de sobrecarga. é utiliado quando queremos flexibilizar as inicializações da classe.
        this.name = name;
        this.price = price;
    }

    public void showResult(){
        System.out.printf("O produto %s custa $%.2f e comprando %d fica no valor de $%.2f%n", name, price, quantity, total);
        System.out.println();
    }

    public void addProduct(){

        System.out.println("Deseja adicionar um produto? y/n");
        String addMore = InputHelper.SCANNER.nextLine();

        if(Objects.equals(addMore, "y")){
            total += price;
            quantity++;
        } else {
            System.out.println("Operação cancelada. A quantidade continua a mesma."); // não é preciso retornar a própria quantidade, visto que se ela não entrar no bloco if, ela já não funciona
        }
    }

    public void removeProduct(){
        System.out.println("Deseja remover um produto? y/n");
        String addLess = InputHelper.SCANNER.nextLine();

        if(Objects.equals(addLess, "y")){
            total -= price;
            quantity--;
        } else {
            System.out.println("Operação cancelada. A quantidade continua a mesma.");
        }
    }
}
