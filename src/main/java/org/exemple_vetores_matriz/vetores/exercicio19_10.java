package org.exemple_vetores_matriz.vetores;

public class exercicio19_10 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];

        vetorA[0] = 120;
        vetorA[1] = 100;
        vetorA[2] = 13;
        vetorA[3] = 14;
        vetorA[4] = 60;
        vetorA[5] = 30;
        vetorA[6] = 21;
        vetorA[7] = 15;
        vetorA[8] = 70;
        vetorA[9] = 30;

        for (int i = 0; i < vetorA.length; i++) {
            int vetorB = vetorA[i] % 2 ;
            System.out.println("vetorB: " + vetorB);
        }
    }
}