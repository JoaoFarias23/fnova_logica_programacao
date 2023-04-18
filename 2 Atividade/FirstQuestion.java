import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque a quantidade de rodas do veiculo");
        int rodas = scanner.nextInt();
        System.out.println("Coloque o peso do veiculo");
        double peso = scanner.nextDouble();
        System.out.println("Quantidade des pessoas no veiculo");
        int pessoas = scanner.nextInt();

        if(rodas >= 2 && rodas <= 3){
            System.out.println("Categoria A");
        }
        else if(rodas ==4 && pessoas >0 && pessoas <=8 && peso <= 3500){
            System.out.println("Categoria B");

        }
        else if(rodas >=4 && peso >= 3500 && peso <= 6000){
            System.out.println("Classe C");
        }
        else if(rodas >=4 && pessoas > 8){
            System.out.println("Classe D");
        }
        else if(rodas >= 4 && peso > 6000){
            System.out.println("Classe E");
        }

        scanner.close();
        
    }
}
