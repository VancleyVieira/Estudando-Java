package Exercicios.Exercicio3;

public class Programa {
    public static void main(String[] args){

        Gerente gerente = new Gerente();
        Supervisor supervisor = new Supervisor();
        Atendente atendente = new Atendente();

        System.out.println(atendente.mostraSalarioAtendente());
        System.out.println(gerente.mostraSalarioGerente());
        System.out.println(supervisor.mostraSalarioSupervisor());

        System.out.println(gerente.mostraGerente());
        System.out.println(supervisor.mostraSupervisor());
        System.out.println(atendente.mostraAtendente());
    }
}
