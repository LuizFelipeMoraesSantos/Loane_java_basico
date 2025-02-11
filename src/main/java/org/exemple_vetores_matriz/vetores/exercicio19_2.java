package org.exemple_vetores_matriz.vetores;

public class exercicio19_2 {
    public static void main(String[] args) {
        int[] vetorA = new int[8];

        vetorA[0] = 16;
        vetorA[1] = 5;
        vetorA[2] = 3;
        vetorA[3] = 7;
        vetorA[4] = 1;
        vetorA[5] = 10;
        vetorA[6] = 4;
        vetorA[7] = 8;


        for(int vetor: vetorA){
            int vetorB = (int) Math.pow(vetor,2);
            System.out.println("vetorB: " + vetorB);
        }

    }
}
