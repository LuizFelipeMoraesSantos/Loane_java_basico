package org.exemple_vetores_matriz.vetores;

public class exercicio19_5 {
    public static void main(String[] args) {

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


         for(int i =0; i < vetorA.length; i++){
             int vetorC = vetorA[i] * i;
             System.out.println("vetroC: "+vetorC);

         }

    }
}
