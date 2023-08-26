import java.util.Scanner;

public class howFunction {

    public static int readHigher(){

        System.out.println("Enter three numbers: ");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner. nextInt();
        int c = scanner.nextInt();

        int aux; // utilizar um parâmetro que indique ser um número inteiro que será retornado, para poder ser utilizado no return da função

        if(a > b && a > c){
            aux = a;
        }else if(b > a && b > c){
            aux = b;
        }else{
            aux = c;
        }
        scanner.close();
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher: " + value);
    }

    public static void main(String[] args){
        showResult(readHigher());
    }

}
