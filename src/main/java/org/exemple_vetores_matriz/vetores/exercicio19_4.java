package org.exemple_vetores_matriz.vetores;

public class exercicio19_4 {
    public static void main(String[] args){

        int[] vetorA = new int[15];


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
        vetorA[10] = 25;
        vetorA[11] = 32;
        vetorA[12] = 14;
        vetorA[13] = 30;
        vetorA[14] = 6;

        for(int vetor: vetorA){
            int vetorB =(int) Math.pow(vetor, 2);
            System.out.println("vetorB: " + vetorB);
        }
    }
}
