package org.exemple_vetores_matriz.vetores;

public class aula1 {
    public static void main(String[] args) {
        double tempDia001 = 31.02;
        double tempDia002 = 33;
        double tempDia003 = 31;
        double tempDia004 = 29.05;
        double tempDia005 = 28.07;

        //cirando array temperatura
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.2;
        temperaturas[1] = 33;
        temperaturas[2] = 31;
        temperaturas[3] = 29.05;
        temperaturas[4] = 28.07;

        System.out.println("A temperatura do dia 1 é: " + temperaturas[0]+"°C");

        System.out.println("O tamanho do array: "+temperaturas.length);

        //iteração de uma array
        for(int i=0;i<temperaturas.length;i++){
            System.out.println("o valor da temperatura do dia "+ (i + 1)+" é "+temperaturas[i]);
        }
        //for melhorado
        for(double temp : temperaturas){
            System.out.println(temp);
        }
    }
}
