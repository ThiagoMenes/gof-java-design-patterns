package edu.thiago.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("O Robô está se Movendo defensivamente...");
    }
}
