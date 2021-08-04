package Exercicios.Arrays;

public class criandoArray {
    public static void main(String[] args){
        //conceitos e declaração de arrays
        int[] meuArray = new int[7];

        int[] meuArray2 = {1,2,3,4,5,6,7};

        System.out.println(meuArray);
        System.out.println(meuArray2);

        //Alterando valor de um elemento
        meuArray2[2] = 10;
        System.out.println(meuArray2[2]);
        //comprimento do array
        System.out.println(meuArray.length);

    }
}
