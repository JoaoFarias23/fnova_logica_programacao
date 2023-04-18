import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> idades = new ArrayList<>();

        for (int i = 0; i <= 12; i++) {
            System.out.println("Digite uma idade");
            idades.add(scanner.nextInt());
        }
        System.out.println("Menor idade: " + idades.stream().min(Integer::compareTo).get());
        System.out.println("Maior idade: " + idades.stream().max(Integer::compareTo).get());
        scanner.close();

        }
    }
    

