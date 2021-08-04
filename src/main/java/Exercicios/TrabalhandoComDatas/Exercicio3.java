package Exercicios.TrabalhandoComDatas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio3 {

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat  formatterhora = new SimpleDateFormat("HH:mm:ss:mmm");

        String dataFormatada = formatter.format(agora);
        String horaFormatada = formatterhora.format(agora);

        System.out.println(dataFormatada);
        // 14/07/2019
        System.out.println(horaFormatada);
    }
}
