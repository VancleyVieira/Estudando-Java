package Exercicios.Exercicio3;

public class Atendente extends Funcionarios{

    private Double impostosAtendente;

    @Override
    public Integer getSalario() {
        return 1000;
    }
    public Double getImpostosAtendente(){
        return impostosAtendente;
    }
    public void setImpostosAtendente(Double impostosAtendente){
        this.impostosAtendente = impostosAtendente;
    }
    public double calculaImpostosAtendente(){
        return this.getSalario() * 0.01;
    }
    public String mostraSalarioAtendente() {
        return "O salario do atendente e: " + getSalario() + " reais";
    }
   public String mostraAtendente() {
        return "O atendente deve pagar: "+calculaImpostosAtendente()+" reais de impostos";
    }
}
