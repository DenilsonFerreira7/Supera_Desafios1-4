package desafioQuatro;
import java.util.Scanner;
public class DesafioQuatro {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite o número de casos de teste: ");
            int N = Integer.parseInt(leitor.nextLine()); // Leitura do número de casos de teste

            StringBuilder resultado = new StringBuilder();

            System.out.println("\nDigite as frases para serem corrigidas e tecle enter:");
            for (int i = 0; i < N; i++) {
                String frase = leitor.nextLine(); // Leitura da linha de entrada
                StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
                StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
                parte1.reverse();
                parte2.reverse();
                resultado.append("Frase corrigida: ").append(parte1.toString()).append(parte2.toString()).append("\n");
            }

            System.out.println("\nCorreção completa:\n" + resultado.toString());

            leitor.close();
        }
}
