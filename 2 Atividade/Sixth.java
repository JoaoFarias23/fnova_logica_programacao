import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque seu cpf");
        String cpf = scanner.nextLine();
        Matcher pattern = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}").matcher(cpf);
        if (pattern.matches()) {
            System.out.println("CPF válido");
            return;
        }  
            System.out.println("CPF inválido");

            scanner.close();
    }
    
}
