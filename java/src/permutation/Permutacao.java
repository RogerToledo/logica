package permutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutacao {
    public static void main(String[] args) {
        System.out.println(solucao(432));
    }

    public static int solucao(int n) {
        List<List<Integer>> permutacoes;
        List<Integer> lista = new ArrayList<>();
        Set<Integer> numeros = new HashSet<>();

        //Separa os numeros
        while (n != 0) {
            int digito = n % 10;
            n = n / 10;
            lista.add(digito);
        }

        permutacoes = permuta(lista.toArray(new Integer[lista.size()]));

        for (List<Integer> permutacao : permutacoes) {
            Integer numero = 0;
            int multiplicador = 1;
            boolean pular = false;

            for (int i = permutacao.size() - 1; i >= 0; i--) {
                Integer digito = permutacao.get(i);

                if (i == permutacao.size() - 1 && digito == 0) {
                    pular = true;
                }

                numero = numero + (digito * multiplicador);
                multiplicador = multiplicador * 10;
            }

            if (!pular) {
                numeros.add(numero);
            }
        }

        //numeros.forEach(System.out::println);

        return numeros.size();
    }

    public static List<List<Integer>> permuta(Integer[] numeros) {
        List<List<Integer>> permutacoes = new ArrayList<>();
        permutacoes.add(new ArrayList<>());

        // Monta lista com sequencias
        for (int i = 0; i < numeros.length; i++) {
            List<List<Integer>> atual = new ArrayList<>();

            for (List<Integer> permutacao : permutacoes) {
                permutacao.forEach(p -> System.out.println("Permt: " + p));

                for (int j = 0, n = permutacao.size() + 1; j < n; j++) {
                    List<Integer> tmp = new ArrayList<>(permutacao);
                    tmp.add(j, numeros[i]);
                    System.out.println("Indice: " + j + " | Valor: " + numeros[i]);
                    atual.add(tmp);
                }
            }
            atual.forEach(a -> System.out.println("Atual: " + a));
            permutacoes = new ArrayList<>(atual);
        }

        return permutacoes;
    }

}

