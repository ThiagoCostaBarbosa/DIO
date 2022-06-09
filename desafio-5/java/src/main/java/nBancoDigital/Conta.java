package nBancoDigital;

public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    protected int numero;
    protected String tipo;
    protected double saldo;

    protected Cliente cliente;

    public Conta( Cliente cliente ) {

        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    @Override
    public void debitar( double valor ) {

        saldo -= valor;

    }

    @Override
    public void depositar( double valor ) {

        saldo += valor;

    }

    public Cliente getCliente() {

        return cliente;

    }

    public String getTipo() {

        return tipo;

    }

    public int getNumero() {

        return numero;

    }

    public double getSaldo() {

        return saldo;

    }

}
