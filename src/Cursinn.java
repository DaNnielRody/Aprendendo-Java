import java.util.Locale;
import java.util.Scanner;

public class Cursinn {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String x;
        char w;
        int y;
        double z;
        x = scanner.nextLine(); // com o nextLine, ele pega toda a saída
        y = scanner.nextInt();
        z = scanner.nextDouble();
        w = scanner.next().charAt(0); // com o next, ele pega só o primeiro espaço
        scanner.nextLine(); // esta linha é necessária para evitar a quebra de linha pendente, evitando que fique pendente e os valores compilados venham errados ou não sejam consumidos. isso acontece quando há um comando diferente do next/nextLine
        Locale.setDefault(Locale.US);
        System.out.printf("Você digitou: %s %d %.2f %s", x, y, z, w); // o print f sem locale imprime com a vírgula. se fosse o println ele imprimiria direto com .


        double huge = scanner.nextDouble();
        System.out.println(huge);


        System.out.print("Digite um número: ");
        int zap = scanner.nextInt(); // o scanner interage entre os prints. se utilizar ele no meio, é como se o print anterior já fosse um campo de input pedindo uma saída por si.
        System.out.println("Você digitou: " + zap);
        scanner.close();

    }
}
