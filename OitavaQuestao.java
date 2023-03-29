import java.util.Scanner;

public class OitavaQuestao {
    public static void main(String[] args) {
        // (0 °C × 9/5) + 32
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digita a temp em Celsius");
        Double tempcelsius = scanner.nextDouble();
        Double tempfire = ( tempcelsius * 1.8f ) + 32;
        System.out.println(tempfire + "F");

        //Fórmula Celsius-Kelvin: K =  TempC + 273
        System.out.println("Digite a temp em Celsius");
        Double tempc = scanner.nextDouble();
        Double tempK = (tempc + 273);
        System.out.println(tempK + "K");
        scanner.close();
    }
}