package j;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JogoDistanciaEntreDoisPontos {

    public static void main( String[] args ) {

        DecimalFormat formato = new DecimalFormat( "#0.0000" );
        Scanner scan = new Scanner( System.in );

        String[] linha1 = scan.nextLine( ).split( " " );
        String[] linha2 = scan.nextLine( ).split( " " );

        scan.close( );

        double x1 = Double.parseDouble( linha1[ 0 ] );
        double x2 = Double.parseDouble( linha2[ 0 ] );

        double y1 = Double.parseDouble( linha1[ 1 ] );
        double y2 = Double.parseDouble( linha2[ 1 ] );

        double distancia = Math.sqrt( Math.pow( x2 - x1, 2 ) + Math.pow( y2 - y1, 2 ) );

        System.out.println( formato.format( distancia ) );

    }

}