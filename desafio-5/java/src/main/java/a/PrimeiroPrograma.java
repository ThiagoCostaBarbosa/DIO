package a;

import a.model.Gato;

public class PrimeiroPrograma {

    public static void main( String[] args ) {

        int a = 5;
        int b = 3;
        System.out.println( "Hello World! " + (a + b) );

        Gato gato = new Gato( "Mimi", "castanho", 3 );
        System.out.println( gato );

        Livros livros = new Livros( );
        System.out.println( livros );

    }

}

class Livros {

    public String nome;
    private String npag;

}