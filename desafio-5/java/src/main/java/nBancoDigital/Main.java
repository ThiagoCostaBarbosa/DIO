package nBancoDigital;

public class Main {

    public static void main( String[] args ) {

        Banco banco = new Banco( 1, "DIO" );

        Cliente venilton = new Cliente( );
        venilton.setNome( "Venilton" );

        Conta contaUm = criarContaCorrente( banco, venilton );
        Conta contaDois = criarContaPoupanca( banco, venilton );

        depositar( banco, contaUm, 500 );
        transferir( contaUm, contaDois, 100 );
        depositar( banco, contaDois, 100 );
        sacar( banco, contaUm, 200 );

        imprimirExtratoConta( contaUm );
        imprimirExtratoConta( contaDois );
        imprimirBalancoBanco( banco );

    }

    //Controller

    public static Conta criarContaCorrente( Banco banco, Cliente cliente ) {

        Conta conta = new ContaCorrente( cliente );
        banco.addConta( conta );
        return conta;

    }

    public static Conta criarContaPoupanca( Banco banco, Cliente cliente ) {

        Conta conta = new ContaPoupanca( cliente );
        banco.addConta( conta );
        return conta;

    }

    public static void depositar( Banco banco, Conta conta, double valor ) {

        conta.depositar( valor );
        banco.depositar( valor );

    }

    public static void sacar( Banco banco, Conta conta, double valor ) {

        conta.debitar( valor );
        banco.debitar( valor );

    }

    public static void transferir( Conta contaDebito, Conta contaDeposito, double valor ) {

        contaDebito.debitar( valor );
        contaDeposito.depositar( valor );

    }

    public static void imprimirExtratoConta( Conta conta ) {

        System.out.printf( "=== Conta %s ===%n", conta.getTipo( ) );
        System.out.printf( "Titular: %s%n", conta.getCliente( ).getNome( ) );
        System.out.printf( "Número da Conta: %d%n", conta.getNumero( ) );
        System.out.printf( "Saldo: %.2f%n", conta.getSaldo( ) );
        System.out.println( );

    }

    public static void imprimirBalancoBanco( Banco banco ) {

        System.out.printf( "=== Banco %s ===%n", banco.getNome( ) );
        System.out.printf( "Saldo: %.2f%n", banco.getSaldo( ) );
        System.out.printf( "Quantidade de Contas: %d%n", banco.getNumeroDeContas( ) );
        System.out.println( );

    }

}
