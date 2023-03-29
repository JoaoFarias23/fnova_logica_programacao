import java.util.Scanner;

public class SextaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sera parcelado ou à vista ?");
        String tipoPagamento = scanner.nextLine();
        String pagamento = "";

        if (!tipoPagamento.contains("parcelado")) {
            System.out.println("pix,credito ou debito?");
            pagamento = scanner.nextLine();

        }


        double preco = 1500.00;

        if (tipoPagamento.contains("parcelado")) {
            System.out.println("Digite a quantidade de parcelas");
            int quantidadeParcelas = scanner.nextInt();
            double precoParcelado = (preco / quantidadeParcelas) * 0.10;
            double precoFinal = preco / quantidadeParcelas + precoParcelado;
            System.out.println("Preco total " + preco + ", e o preco de cada parcela com uma taxa de 10% ao mes " + precoFinal);
        } else if (tipoPagamento.contains("vista") && pagamento.contains("credito")) {

            System.out.println("Preco a vista no credito a vista R$" + preco);

        } else {
            double precoPix = preco - (preco * 0.10);
            System.out.println("Preco a vista no pix/debito R$" + precoPix);
        }scanner.close();

    }
}
