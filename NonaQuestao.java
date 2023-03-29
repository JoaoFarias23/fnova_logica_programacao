import java.util.Scanner;

public class NonaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Coloque um numero \n");

        Double calculoX = scanner.nextDouble();

        System.out.printf("Coloque um numero \n");

        Double calculoY = scanner.nextDouble();

        Double soma = calculoX + calculoY;
        System.out.println("Soma de calculo X com calculo Y = " + soma);

        Double subtrair = calculoX - calculoY;
        System.out.println("Subtracao de calculo X com calculo Y = " + subtrair);

        Double multiplicar = calculoX * calculoY;
        System.out.println("Multiplicacao de calculo X com calculo Y = " + multiplicar);

        Double divisao = calculoX / calculoY;
        System.out.println("Divisao de calculo X com calculo Y = " + divisao);

        Double resto = calculoX % calculoY;
        System.out.println("Resto de calculo X com calculo Y = " + resto);

        scanner.close();


    }
}
