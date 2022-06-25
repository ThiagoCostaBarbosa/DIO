package gPatterns.Java.subsistemaExternoApiCep;

public class CepApi {

    private static CepApi instancia = new CepApi( );

    private CepApi() {
        super( );
    }

    public static CepApi getInstancia() {

        return instancia;

    }

    public String recuperarCidade( String cep ) {

        return "Criciúma";

    }

    public String recuperarEstado( String cep ) {

        return "SC";

    }

}
