package desafioTres;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do tamanho do array
        System.out.print("Digite o tamanho do array (n): ");
        int n = scanner.nextInt();

        // Leitura do valor alvo
        System.out.print("Digite o valor alvo (k): ");
        int k = scanner.nextInt();

        // Leitura dos elementos do array
        System.out.print("Digite os elementos do array separados por espaço: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ordenação do array para facilitar a busca
        Arrays.sort(arr);

        // Contagem dos pares com a diferença igual ao valor alvo
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n && arr[j] - arr[i] <= k) {
                if (arr[j] - arr[i] == k) {
                    count++;
                }
                j++;
            }
        }

        // Impressão do número de pares encontrados
        System.out.println("Número de pares encontrados: " + count);
    }
}
