package raio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GincanaAcampamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean executar = true;
        List<String> nome = new ArrayList<>();

        while(executar){
            System.out.print("Digite a quantidade total do grupo: ");
            int grupo = sc.nextInt();
            if(grupo > 0){
                if(grupo <= 100){
                    for(int i = 0; i < grupo; i++){
                        System.out.print("Digite Nome e valor ");
                        nome.add(sc.next());
                    }
                    nome.forEach(System.out::println);
                }else{
                    System.out.println("Valor deve ser menor ou igual a 100");
                }

            }else{
                executar = false;
            }
        }

        System.out.println("Saindo...");
    }
}