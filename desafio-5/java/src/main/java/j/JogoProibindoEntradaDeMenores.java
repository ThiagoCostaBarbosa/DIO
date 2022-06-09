package j;

import java.util.Arrays;
import java.util.Scanner;

public class JogoProibindoEntradaDeMenores {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );
        int N = scan.nextInt( );

        String[] s = new String[ N ];
        Arrays.setAll( s, i -> scanLine( scan ) );
        scan.close( );

        int[] idade = new int[ N ];
        Arrays.setAll( idade, i -> Integer.parseInt( s[ i ] ) );

        System.out.println( "Nao poderao entrar as idades: " );
        Arrays.stream( idade ).filter( v -> v < 18 ).forEach( System.out::println );

    }

    private static String scanLine( Scanner scan ) {

        String string;
        do string = scan.nextLine( ); while( String.valueOf( string ).matches( "" ) );
        return string.replace( "(\r\n|\r|\n)", "" );

    }

}