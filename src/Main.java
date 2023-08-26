import java.util.Locale;

public class Main {

    public static void main(String[] args){

        int x = 31;
        double y = 10.2342342;

        double renda = 4000.0;
        String nome = "Maria";

        System.out.println("Hello World");
        Locale.setDefault(Locale.US); // para relevar a formatação dos EUA.

        System.out.printf("Resultado = %d metros%n", x); //%d para formatar int, %n para quebrar linha.
        System.out.printf("Resultado = %.2f metros%n", y); //%f para formatar float, %n para quebrar linha.

        System.out.printf("%s tem %d anos e ganha %.1f reais", nome, x, renda); //%s para formatar texto.

        //boas práticas para a atribuição do tipo double:

        double g = 2.0;

        //boas práticas para atribuição do tipo float:

        float h = 1f;

        // exemplo de Casting (conversão explícita):

        int b;
        double a = 2.5;

        b = (int) a; // o b não pode receber diretamente o a, por isso o Casting(conversão).
    }
}
