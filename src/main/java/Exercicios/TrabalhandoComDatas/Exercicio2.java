package Exercicios.TrabalhandoComDatas;

import java.util.Calendar;

public class Exercicio2 {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        data.set(2021, Calendar.JULY, 26);

        System.out.printf("\nA compra foi realizada em: "  +"%tD\n",data.getTime());

        data.add(Calendar.DATE,  31);
        System.out.printf("\nA data limite para o pagamento e: " + "%tD" ,data.getTime());
        System.out.println(" Pague seu boleto nos proximos 10 dias, \ncaso contrario a fatura recebera juros!!");

        System.out.println("\n----------10 DIAS UTEIS DEPOIS..----------\n");

        data.add(Calendar.DATE,  10);
        System.out.printf("O tempo para o pagamento expirou: " + "%tD" ,data.getTime());
        System.out.println(" Portano, sera acrescentado um juros na fatura do seu boleto!!");

    }
}
