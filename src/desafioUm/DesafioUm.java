package desafioUm;

import java.util.*;

public class DesafioUm {
    public static void main(String[] args) {
        System.out.println("digite 11 numeros");
            Scanner scanner = new Scanner(System.in);

            int n = 11; // Número fixo de valores de entrada
            List<Integer> pares = new ArrayList<>();
            List<Integer> impares = new ArrayList<>();

            // Leitura dos valores de entrada
            for (int i = 0; i < n; i++) {
                int valor = scanner.nextInt();
                if (valor % 2 == 0) {
                    pares.add(valor);
                } else {
                    impares.add(valor);
                }
            }

            // Ordenação dos pares em ordem crescente
            Collections.sort(pares);

            // Ordenação dos ímpares em ordem decrescente
            Collections.sort(impares, Comparator.reverseOrder());

            // Impressão dos valores ordenados
            pares.forEach(System.out::println);
            impares.forEach(System.out::println);
        }
    }

