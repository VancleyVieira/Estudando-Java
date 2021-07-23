package Exercicios.Exercicio2;

public class Carros {

    private String Marca;
    private String Modelo;
    private String Ano;
    private String Variante ="1.0";

    public Carros(String Marca, String Modelo, String Ano) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }



    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        this.Ano = ano;
    }

    public String getVariante() {
        return Variante;
    }

}
