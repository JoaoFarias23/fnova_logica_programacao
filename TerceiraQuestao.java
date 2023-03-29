import java.util.Scanner;

public class TerceiraQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        Integer X = scanner.nextInt();
        if(X % 2 == 0){
            System.out.println("seu numero e par");
        } else{
            System.out.println("seu numero e impar");
        }
        scanner.close();
    }
    
}
