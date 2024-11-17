package edu.thiago.gof.strategy;

public class Robo {
    private Comportamento comportamento; //comportamento == Strategy
    private Acao acao; /// ação == Strategy

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    
    public void setAcao(Acao acao) {
        this.acao = acao;
    }


    public void mover(){
        comportamento.mover();
    }

    public void realizarAcao(){
        acao.realizarAcao();
    }



 
    
}
