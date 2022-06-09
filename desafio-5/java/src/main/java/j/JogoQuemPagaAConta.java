package j;

import java.io.IOException;
import java.util.Scanner;

public class JogoQuemPagaAConta {

    public static void main( String[] args ) throws IOException {

        Scanner input = new Scanner( System.in );

        while( input.hasNext( ) ) {

            System.out.println( input.nextInt( ) % 2 );

        }

    }

}