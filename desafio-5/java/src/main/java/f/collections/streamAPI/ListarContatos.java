package f.collections.streamAPI;

import f.collections.map.listarContatos.Contato;

import java.util.*;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class ListarContatos {

    public static void main( String[] args ) {
        System.out.println( "--\tOrdem aleatória\t--" );
        Map<Integer, Contato> agenda = new HashMap<>( ) {{
            put( 1, new Contato( "Simba", 5555 ) );
            put( 4, new Contato( "Cami", 1111 ) );
            put( 3, new Contato( "Jon", 2222 ) );
        }};
        System.out.println( agenda );
        agenda.forEach( ( key, value ) -> System.out.println( key + " - " + value.getNome( ) ) );

        System.out.println( "--\tOrdem Inserção\t--" );
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>( ) {{
            put( 1, new Contato( "Simba", 5555 ) );
            put( 4, new Contato( "Cami", 1111 ) );
            put( 3, new Contato( "Jon", 2222 ) );
        }};

        System.out.println( agenda1 );
        agenda1.forEach( ( key, value ) -> System.out.println( key + " - " + value.getNome( ) ) );

        System.out.println( "--\tOrdem id\t--" );
        Map<Integer, Contato> agenda2 = new TreeMap<>( agenda );
        System.out.println( agenda2 );
        agenda2.forEach( ( key, value ) -> System.out.println( key + " - " + value.getNome( ) ) );

        System.out.println( "--\tOrdem número telefone\t--" );

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>( Comparator.comparing(
                cont -> cont.getValue( ).getNumero( ) ) );
        set.addAll( agenda.entrySet( ) );
        set.stream( ).map( entry -> entry.getKey( ) + " - " + entry.getValue( ).getNumero( ) +
                                    ": " + entry.getValue( ).getNome( ) ).forEach( System.out::println );

        System.out.println( "--\tOrdem nome contato\t--" );
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>( Comparator.comparing(
                cont -> cont.getValue( ).getNome( ) ) );
        set1.addAll( agenda.entrySet( ) );
        //imprimindo usando forEach
        set1.forEach( entry -> System.out.println( entry.getKey( ) + " - " + entry.getValue( ).getNome( ) ) );

    }

}

