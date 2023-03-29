import java.util.Scanner;

public class SetimaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota 1");
        Double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2");
        Double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota 3");
        Double nota3 = scanner.nextDouble();
        Double media = nota1 + (nota2 * 2) + (nota3 * 2);
        if(media >= 90){
            System.out.println("Aprovado com nota A");
        }else if(media >= 75 && media <90 ){
            System.out.println("Aprovado com nota B");
        }else if(media >= 60 && media <75){
            System.out.println("Aprovado com nota C");
        }else if(media >= 40 && media <60){
            System.out.println("Reprovado com nota D");
        }else{
            System.out.println("Reprovado com nota E");
        }scanner.close();
    }   
    
}
