package Exercicios.Exercicio1;

public class Carro {

        public String marca = "Ford";
        public String capacidade = "5 pessoas";
        public String saiuDoCarro = "saiu do carro";
        public String entrounoCarro = "entrou no carro";

        public String getMarca(){
            return marca;
        }
        public String getCapacidade(){
            return capacidade;
        }
        public String getSaiuDoCarro(){
            return saiuDoCarro;
        }
        public String getEntrouNoCarro(){
            return entrounoCarro;
        }
        public String ApresentarMarca(){
            return "O carro da marca: " + getMarca();
        }
        public String ApresentaCapacidade(){
            return "Esta trasnportando: " + getCapacidade();
        }
        public String SaiuDoCarro(){
            return "Uma pessoa " + getSaiuDoCarro();
        }
        public String EntrouNoCarro(){
            return "Uma pessoa " + getEntrouNoCarro();
        }
}

