package edu.thiago.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("O Robô está se Movendo agressivamente...");
    }
}
