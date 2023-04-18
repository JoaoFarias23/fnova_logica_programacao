import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero");
        int numero = scanner.nextInt();
        System.out.println(Integer.toBinaryString(numero));
        scanner.close();
    }
    
}
