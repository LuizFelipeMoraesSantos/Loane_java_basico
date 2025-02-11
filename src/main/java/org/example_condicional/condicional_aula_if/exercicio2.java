package org.example_condicional.condicional_aula_if;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a idade do aluno: ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade.");
        }else{
            System.out.println("Não é maior de idade.");
        }


    }
}
