package j;

import java.util.Scanner;

public class JogoDeQuemEAVez {

    public static void main( String[] args ) {

        Scanner scan = new Scanner( System.in );

        int QT = Integer.parseInt( scan.nextLine( ) );

        String[] linha1, linha2;
        String nome1, escolha1, nome2;
        int N, M;

        for( int i = 0; i < QT; i++ ) {

            linha1 = scanLine( scan ).split( " " );
            linha2 = scanLine( scan ).split( " " );

            N = Integer.parseInt( linha2[ 0 ] );
            M = Integer.parseInt( linha2[ 1 ] );

            nome1 = linha1[ 0 ];
            escolha1 = linha1[ 1 ];

            nome2 = linha1[ 3 ];

            if( ((N + M) % 2 == 0 && escolha1.equalsIgnoreCase( "PAR" )) ||
                ((N + M) % 2 == 1 && escolha1.equalsIgnoreCase( "IMPAR" )) ) System.out.println( nome1 );
            else System.out.println( nome2 );

        }

    }

    private static String scanLine( Scanner scan ) {

        String string;
        do string = scan.nextLine( ); while( String.valueOf( string ).matches( "" ) );
        return string;

    }

}
