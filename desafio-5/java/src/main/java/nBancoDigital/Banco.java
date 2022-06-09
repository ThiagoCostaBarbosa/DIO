package nBancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private Integer numero;
    private String nome;
    private List<Conta> contas =  new ArrayList<Conta>( );


    private double saldo = 0d;


    public Banco( Integer numero , String nome ) {

        this.numero = numero;
        this.nome = nome;

    }
    public Integer getNumero() {

        return numero;

    }

    public void setNumero( Integer numero ) {

        this.numero = numero;

    }

    public String getNome() {

        return nome;

    }

    public void setNome( String nome ) {

        this.nome = nome;

    }

    public List<Conta> getContas() {

        return contas;

    }

    public void setContas( List<Conta> contas ) {

        this.contas = contas;

    }
    public void addConta( Conta conta ) {

        this.contas.add(conta);

    }

    public double getSaldo() {

        return this.saldo;

    }

    public void debitar( double valor ) {

        this.saldo -= valor;

    }
    public void depositar( double valor ) {

        this.saldo += valor;

    }

    public int getNumeroDeContas() {

        return this.contas.size();

    }
}
