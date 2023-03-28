import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Coloque um numero \n");

        double calculoX = scanner.nextDouble();

        System.out.printf("Coloque um numero \n");

        double calculoY = scanner.nextDouble();

        double soma = calculoX + calculoY;
        System.out.println("Soma de calculo 1 com calculo 2 = " + soma);
        scanner.close();
    }
}

    

