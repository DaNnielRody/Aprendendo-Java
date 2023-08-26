package learningMore;

import java.util.Locale;
import java.util.Scanner;

public class howOrientation2 {

    public static void showResult(double value){
        System.out.printf("Triangle area: %.4f%n", value);
    }

    public static void verifyHigher(double x, double y){
        if(x > y){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }
    }

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double resultX = x.triangleArea();
        double resultY = y.triangleArea();

        showResult(resultX);
        showResult(resultY);

        verifyHigher(resultX, resultY);
        scanner.close();
    }
}