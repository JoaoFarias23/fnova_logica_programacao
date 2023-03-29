import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        Integer A = scanner.nextInt();
        System.out.println("Digite outro numero");
        Integer B = scanner.nextInt();
        final Integer c;
        if(A >= B){
            c = A + B;
            System.out.println("O primeiro numero foi maior ou seja ele foi igual a " + c);
        }else if(B > A){
            c = A * B;
            System.out.println("O segundo numero foi maior ou seja ele foi igual a " + c);


        }
        scanner.close();
    }

}