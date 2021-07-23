package Exercicios.Exercicio2;

public class InstanciandoObjeto {

    public static void main(String[] args){


        Carros carros = new Carros("volkswagen", "Gol", "1995");

        System.out.println(carros.getMarca());
        System.out.println(carros.getModelo());
        System.out.println(carros.getAno());
        System.out.println(carros.getVariante());

    }
}
