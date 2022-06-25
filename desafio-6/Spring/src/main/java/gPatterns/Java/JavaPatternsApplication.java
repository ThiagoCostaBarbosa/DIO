package gPatterns.Java;

import gPatterns.Java.facade.Facade;
import gPatterns.Java.singleton.SingletonEager;
import gPatterns.Java.singleton.SingletonLazy;
import gPatterns.Java.singleton.SingletonLazyHolder;
import gPatterns.Java.strategy.*;

public class JavaPatternsApplication {

    public static void main( String[] args ) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia( );
        System.out.println( lazy );
        lazy = SingletonLazy.getInstancia( );
        System.out.println( lazy );

        SingletonEager eager = SingletonEager.getInstancia( );
        System.out.println( eager );
        eager = SingletonEager.getInstancia( );
        System.out.println( eager );

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia( );
        System.out.println( lazyHolder );
        lazyHolder = SingletonLazyHolder.getInstancia( );
        System.out.println( lazyHolder );

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo( );
        Comportamento normal = new ComportamentoNormal( );
        Comportamento agressivo = new ComportamentoAgressivo( );

        Robo robo = new Robo( );
        robo.setComportamento( normal );
        robo.mover( );
        robo.mover( );
        robo.setComportamento( defensivo );
        robo.mover( );
        robo.setComportamento( agressivo );
        robo.mover( );
        robo.mover( );
        robo.mover( );

        // Facade

        Facade facade = new Facade( );
        facade.migrarCliente( "Thiago", "88805000" );

    }

}
