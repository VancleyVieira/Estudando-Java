package Exercicios.TrabalhandoComDatas;

import java.time.LocalDateTime;


public class Exercicio4 {
    public static void main(String[] args){

       LocalDateTime data = LocalDateTime.of(2010, 05, 15, 10,00,00);

       LocalDateTime futuro = data.plusHours(13).plusYears(4).plusMonths(6);

        System.out.println(data);
        System.out.println(futuro);
    }

}
