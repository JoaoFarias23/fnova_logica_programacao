import java.util.Scanner;

public class SextaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sera parcelado ou à vista ?");
        String tipoPagamento = scanner.nextLine();

        String pagamento;

        if(tipoPagamento.contains("parcelado")){
            pagamento = "credito";
        }else{
            System.out.println("Pix ou debito?");
            pagamento = scanner.nextLine();
        }

        double preco = 1500.00;

        if (tipoPagamento.contains("parcelado") && pagamento.contains("credito") ) {
            System.out.println("Digite a quantidade de parcelas");
            Integer quantidadeParcelas = scanner.nextInt();
            Double precoParcelado = (preco / quantidadeParcelas) * 0.10;
            Double precoFinal = preco / quantidadeParcelas + precoParcelado;
            System.out.println("Preco total " + preco + ", e o preco de cada parcela com uma taxa de 10% ao mes " + precoFinal);
        } else if (pagamento.contains("debito")) {

            System.out.println("Preco a vista no debito R$"+ preco);

        }else{
            Double precoPix = preco - (preco * 0.10);
            System.out.println("Preco a vista no pix R$"+precoPix);
        }scanner.close();

    }
}