package j;

import java.io.IOException;
import java.util.Scanner;

public class JogoDuasNotas {

    public static void main( String[] args ) throws IOException {

        Scanner leitor = new Scanner( System.in );

        while( true ) {

            int N = leitor.nextInt( );
            int M = leitor.nextInt( );
            int troco = M - N;
            int[] notas = { 2, 5, 10, 20, 50, 100 };
            boolean possivel = false;

            if( N == 0 && M == 0 ) break;

            for( int i = 0; i < 6; i++ ) {

                for( int j = 0; j < 6; j++ ) {

                    if( (notas[ i ] + notas[ j ]) == troco ) {

                        possivel = true;
                        break;

                    }

                }

            }

            System.out.println( possivel ? "possible" : "impossible" );

        }

    }

}