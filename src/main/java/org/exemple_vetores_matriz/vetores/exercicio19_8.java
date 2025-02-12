package org.exemple_vetores_matriz.vetores;

public class exercicio19_8 {
    public static void main(String[] args){
            int[] vetorA = new int[10];

            vetorA[0] = 120;
            vetorA[1] = 100;
            vetorA[2] = 80;
            vetorA[3] = 14;
            vetorA[4] = 60;
            vetorA[5] = 30;
            vetorA[6] = 22;
            vetorA[7] = 15;
            vetorA[8] = 70;
            vetorA[9] = 30;

            int[] vetorB = new int[10];

            vetorB[0] = 16;
            vetorB[1] = 5;
            vetorB[2] = 3;
            vetorB[3] = 7;
            vetorB[4] = 1;
            vetorB[5] = 10;
            vetorB[6] = 4;
            vetorB[7] = 8;
            vetorB[8] = 26;
            vetorB[9] = 14;

            for(int i = 0; i< vetorA.length;i++){
                int vetorC = vetorA[i] * vetorB[i];
                System.out.println("vetorC: "+vetorC);
            }
    }
}
