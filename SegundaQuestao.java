import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Coloque um numero \n");

        Double calculoX = scanner.nextDouble();

        System.out.printf("Coloque um numero \n");

        Double calculoY = scanner.nextDouble();

        Double soma = calculoX + calculoY;
        System.out.println("Soma de calculo 1 com calculo 2 = " + soma);
        scanner.close();
    }
}