package Exercicios.Exercicio3;

public class Gerente extends Funcionarios{

    private Double impostosGerente;

    @Override
    public Integer getSalario() {
        return 3000;
    }
    public Double getImpostosGerente(){
        return impostosGerente;
    }
    public void setImpostosGerente(Double impostosGerente){
        this.impostosGerente = impostosGerente;
    }
    public double calculaImpostosGerente(){
        return this.getSalario() * 0.1;
    }
    public String mostraSalarioGerente() {
        return "O salario do Gerente e: " + getSalario() + " reais";
    }
    public String mostraGerente() {
       return "O gerente deve pagar: "+calculaImpostosGerente()+" reais de impostos";
    }
}
