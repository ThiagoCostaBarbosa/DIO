package gPatterns.Java.facade;

import gPatterns.Java.subsistemaCRM.CrmService;
import gPatterns.Java.subsistemaExternoApiCep.CepApi;

public class Facade {

    public void migrarCliente( String nome, String cep ) {

        String cidade = CepApi.getInstancia( ).recuperarCidade( cep );
        String estado = CepApi.getInstancia( ).recuperarEstado( cep );

        CrmService.gravarCliente( nome, cep, cidade, estado );

    }

}
