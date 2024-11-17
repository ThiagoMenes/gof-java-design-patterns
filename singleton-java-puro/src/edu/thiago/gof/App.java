package edu.thiago.gof;

import edu.thiago.gof.facade.Facade;
import edu.thiago.gof.singleton.SingletonEager;
import edu.thiago.gof.singleton.SingletonLazy;
import edu.thiago.gof.singleton.SingletonLazyHolder;
import edu.thiago.gof.strategy.Acao;
import edu.thiago.gof.strategy.AcaoAtaque;
import edu.thiago.gof.strategy.AcaoDefensiva;
import edu.thiago.gof.strategy.Comportamento;
import edu.thiago.gof.strategy.ComportamentoAgressivo;
import edu.thiago.gof.strategy.ComportamentoDefensivo;
import edu.thiago.gof.strategy.ComportamentoNormal;
import edu.thiago.gof.strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Acao ataque = new AcaoAtaque();
        Acao defesa = new AcaoDefensiva();

        Robo robo = new Robo();
        robo.setComportamento(normal);//mudando a estratégia
        robo.mover();
        robo.setComportamento(agressivo);//mudando a Strategy
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setAcao(ataque);
        robo.realizarAcao();
        robo.setAcao(defesa);
        robo.realizarAcao();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Thiago", "145013645");
    }
}
