package Exercicios.Arrays;

public class ArrayMult {
    public static void main(String[]  args){
        int [][] meuArrayMult = {{1,2,3,4}, {5,6,7}};

        //Percorrendo arrays multidimencionais

        for(int i = 0; i < meuArrayMult.length; i++){
            for(int j = 0; j < meuArrayMult[i].length; j++){
                System.out.println(meuArrayMult[i][j]);
            }
        }
    }
}
