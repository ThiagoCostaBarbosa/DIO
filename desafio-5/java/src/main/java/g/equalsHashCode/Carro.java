package g.equalsHashCode;

import java.util.Objects;

public class Carro {

    private String marca;

    public Carro( String marca ) {

        this.marca = marca;

    }

    public String getMarca() {

        return marca;

    }

    public void setMarca( String marca ) {

        this.marca = marca;

    }

    @Override
    public boolean equals( Object o ) {

        if( this == o ) return true;
        if( !(o instanceof g.stack.Carro) ) return false;
        g.stack.Carro carro = (g.stack.Carro) o;
        return Objects.equals( getMarca( ), carro.getMarca( ) );

    }

    @Override
    public int hashCode() {

        return Objects.hash( getMarca( ) );

    }

}
