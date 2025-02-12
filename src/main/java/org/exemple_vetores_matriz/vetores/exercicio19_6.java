package org.exemple_vetores_matriz.vetores;

public class exercicio19_6 {
    public static void main(String[] args){

        int[] vetorA = new int[10];

        vetorA[0] = 50;
        vetorA[1] = 16;
        vetorA[2] = 35;
        vetorA[3] = 17;
        vetorA[4] = 13;
        vetorA[5] = 10;
        vetorA[6] = 5;
        vetorA[7] = 8;
        vetorA[8] = 2;
        vetorA[9] = 17;

        for(int vetor_A: vetorA){
        }
        System.out.println("\n");

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

        for(int vetor_b: vetorB){
        }

        for(int i=0; i< vetorA.length; i++){
            int vetorC = vetorA[i] + vetorB[i];
            System.out.println("vetorC: "+vetorC);
        }
    }
}
