import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        Double numero = scanner.nextDouble();
        Double dobro = numero + numero;
        Double triplo = numero + numero + numero;
        if(dobro >= 0){
            System.out.println(dobro);
        }else{
            System.out.println(triplo);
        }
        scanner.close();

        
        
    }
    
}
