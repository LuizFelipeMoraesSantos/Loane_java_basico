package org.example_condicional.condicional_aula_if;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você tem quantos ovos");

        boolean temBatata= true;
        int ovos = 6;

        if (temBatata){
            ovos = 9;
        }
        System.out.println("Compre" + ovos + " ovos.");
    }
}
