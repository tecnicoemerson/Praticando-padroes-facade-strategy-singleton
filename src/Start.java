import facade.Facade;

public class Start {
    public static void main(String[] args) {
//        //Singleton -- padrão criacional
//        //testes relacionados ao Design Pattern Singleton

//        SingletonLazy lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//        lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//
//        SingletonEager eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//        eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//
//        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder);
//        lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder);



//        //Strategy - padrão Comportamental

//        Comportamento normal = new ComportamentoNormal();
//        Comportamento defensivo = new ComportamentoDefensivo();
//        Comportamento agressivo = new ComportamentoAgressivo();
//
//        Robo robo = new Robo();
//        robo.setComportamento(normal);
//        robo.mover();
//        robo.mover();
//
//        robo.setComportamento(defensivo);
//        robo.mover();
//
//        robo.setComportamento(agressivo);
//        robo.mover();
//        robo.mover();
//        robo.mover();



        //Facade -- padrão estrutural

        Facade facade = new Facade();
        facade.migrarCliente("Emerson", "12345678");
    }
}