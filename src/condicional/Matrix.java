package condicional;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        /**
         * Exercicio para praticar condicionais
         */
        Scanner scan = new Scanner(System.in);

        String pilula;
        System.out.println("Escolha sua realidade:Qual pilula voce quer? Azul ou Vermelha?");
        pilula = scan.next();

        if (pilula.equals("azul")) {
            System.out.println("Voce escolheu a pilula  azul.");
        } else if (pilula.equals("vermelha")) {
            System.out.println("Voce escolheu a pilula  vermelha.Bem-vindo a Matrix");
        } else {
            System.out.println("Erro a Matrix será reiniciada aguarde......");
        }


    }
}
