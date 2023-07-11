package desafioDois;

import java.util.Scanner;

public class DesafioDois {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Leitura do valor monetário
            System.out.println("Digite o valor: ");
            double valor = scanner.nextDouble();

            // Conversão do valor para centavos
            int centavos = (int) (valor * 100);

            // Cálculo das notas e moedas
            int[] notasMoedas = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};

            //notas consideradas
            String[] notasMoedasDescricao = {"100.00", "50.00", "20.00", "10.00", "5.00", "2.00", "1.00", "0.50", "0.25", "0.10", "0.05", "0.01"};

            System.out.println("NOTAS E MOEDAS:");

            for (int i = 0; i < notasMoedas.length; i++) {
                int quantidade = centavos / notasMoedas[i];
                centavos %= notasMoedas[i];

                System.out.printf("%d nota(s) de R$ %s%n", quantidade, notasMoedasDescricao[i]);
            }
        }
}