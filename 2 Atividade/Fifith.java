import java.util.Scanner;

public class Fifith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque a quantidade");
        int estrela = scanner.nextInt();
        for(int i = 0; i < estrela; i++){
            System.out.println("*");
        }
        scanner.close();
    }

}
