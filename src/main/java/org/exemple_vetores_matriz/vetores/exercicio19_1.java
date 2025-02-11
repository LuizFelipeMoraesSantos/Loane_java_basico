package org.exemple_vetores_matriz.vetores;

public class exercicio19_1 {
    public static void main(String[] args) {
        String[] objetosA = new String[5];
        String[] objetosB = new String[5];

        objetosA[0] = "pincel";
        objetosA[1] = "cadeira";
        objetosA[2] = "ventilador";
        objetosA[3] = "computador";
        objetosA[4] = "mouse";

        objetosB[0] = "carro";
        objetosB[1] = "bicicleta";
        objetosB[2] = "caminhão";
        objetosB[3] = "carroça";
        objetosB[4] = "moto";

        for(String objeto : objetosA){
            System.out.println(objeto);
        }
        System.out.println("\n");
        for(String objeto: objetosB){
            System.out.println(objeto);
        }
    }
}
