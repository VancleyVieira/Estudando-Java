package Exercicios.Exercicio3;

public class Supervisor extends Funcionarios{

    private Double impostosSupervisor;

    @Override
    public Integer getSalario() {
        return 2000;
    }
    public Double getImpostosSupervisor(){
        return impostosSupervisor;
    }
    public void setImpostosSupervisor(Double impostosSupervisor){
        this.impostosSupervisor = impostosSupervisor;
    }
    public double calculaImpostosSupervisor(){
        return this.getSalario() * 0.05;
    }
    public String mostraSalarioSupervisor() {
        return "O salario do Supervisor e: " + getSalario() + " reais";
    }
    public String mostraSupervisor() {
        return "O supervisor deve pagar: "+calculaImpostosSupervisor()+" reais de impostos";
    }
}
