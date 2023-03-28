package Temperatura;

public class Temperatura {
    public static void main(String[] args) {
        // (F - 32) x 5/9 = C
        final int ajuste = 32;
        final double fator = 5.0/9.0;
        double fr = 86;
        double Celsius = (fr - ajuste) * fator;
        System.out.println("O resultado e " + Celsius);

    }
}