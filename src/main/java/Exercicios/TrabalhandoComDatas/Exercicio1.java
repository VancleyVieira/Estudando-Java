package Exercicios.TrabalhandoComDatas;

import java.util.Date;

public class Exercicio1 {
    public static void main(String[] args) {

        Date dataNascimento = new Date(997153200000L);
        System.out.println("Minha data de nascimento é: " + dataNascimento);

        Date novaData = new Date(1273934783000L);
        System.out.println("A Nova data é: " + novaData);

        boolean anterior = dataNascimento.before(novaData);

        if (anterior) {
            System.out.println("A data é anterior a 15 de maio de 2010!");
        }else {
            System.out.println("A data é posterior a 15 de maio de 2010");
        }

    }
}
