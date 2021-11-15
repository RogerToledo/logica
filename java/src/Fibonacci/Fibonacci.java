package Fibonacci;

/*
    Crie um programa para imprimir somente os números da série Fibonacci de 0 a 100
    0,1,1,2,3,5,8,13,21...

 */

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        while(a <= 100){
            System.out.println(a);
            b = a + b;
            a = b - a;

        }
    }
}
