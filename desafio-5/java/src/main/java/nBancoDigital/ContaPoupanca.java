package nBancoDigital;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {

        super(cliente);
        this.tipo = "Poupança";
    }

}

