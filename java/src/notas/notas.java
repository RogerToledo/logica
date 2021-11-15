package notas;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
       double nota;
       double soma;
       double media;
       String aluno;
       String sair;

       sair = "N";

       while (!"S".equals(sair)){
           Scanner scanner = new Scanner(System.in);

           System.out.print("Nome do Aluno: ");
           aluno = scanner.next();

           soma = 0.0;

           for(int i = 1; i <= 4; i++ ){
               System.out.print("Nota " + i + " - Digite uma nota entre 0,0 e 10,0: ");
               nota = scanner.nextDouble();
               if(nota < 0 || nota > 10){
                   System.out.println("Por favor digite uma nota válida!!");
                   i--;
               }else{
                   soma += nota;
               }
           }

           media = soma/4;

           if(media >= 7){
               System.out.println("APROVADO!! O aluno " + aluno + " ficou com média " + media + ".");
           }else if(media <= 4){
               System.out.println("REPROVADO - O aluno " + aluno + " ficou com média " + media + ".");
           }else{
               System.out.println("RECUPERAÇÃO - O aluno "  + aluno + " ficou com média " + media + ".");
           }

           System.out.println("Digite S para sair ou N para continuar");
           sair = scanner.next();

       }

        System.out.println("Saindo...");
    }
}
