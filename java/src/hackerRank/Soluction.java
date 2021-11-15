package hackerRank;

import java.util.Scanner;

public class Soluction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++)
        {
            String s1 = sc.next();
            if (s1.length() > 10) {
                System.out.println("String: Maximum 10 alphanumeric characters.");
                break;
            }

            String coluna1 = adicionaEspaco(s1);

            int x = sc.nextInt();
            if (x < 0 && x > 999) {
                System.out.println("int: range from 0 to 999.");
                break;
            }

            String coluna2 = adicionaZerosEsquerda(x);
            System.out.println(String.format("%s%s", coluna1, coluna2));
        }
        System.out.println("================================");

    }

    public static String adicionaZerosEsquerda(int x) {
        String numero = String.valueOf(x);
        int len = numero.length();
        while (len < 3) {
            numero = "0"+numero;
            len = numero.length();
        }

        return numero;
    }

    public static String adicionaEspaco(String s) {
        int len = s.length();
        while (len < 15) {
            s = s + " ";
            len = s.length();
        }

        return s;
    }
}
