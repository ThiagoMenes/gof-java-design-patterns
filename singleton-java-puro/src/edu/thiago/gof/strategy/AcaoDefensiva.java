package edu.thiago.gof.strategy;

public class AcaoDefensiva implements Acao {
    @Override
    public void realizarAcao(){
        System.out.println("O Robô Levantou o Escudo para se proteger...");
    }

}
