import java.util.Scanner;

public class PrimeiraQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade");
        Integer idade = scanner.nextInt();
       

        System.out.println("Ola " + nome + ", voce tem " + idade + " anos");
        scanner.close();

    }
    
}
