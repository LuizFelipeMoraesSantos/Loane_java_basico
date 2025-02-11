package org.example_condicional.condicional_aula_if;

import java.util.Scanner;

public class exercicio3 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o preço do produto: ");
        double preco = scan.nextDouble();

        if(preco <= 10){
            System.out.println("Pode comprar, está barato!");
        } else if( preco > 10 && preco < 15){
            System.out.println("Você pode pedir desconto.");
        } else{
            System.out.println("Esta muito caro!");
        }

    }

}
