package dPropertiesValue.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Value("${d.nome}")
    private String nome;

    @Value("${d.email}")
    private String email;

    @Value("${d.telefones}")
    private List<Long> telefones = new ArrayList<>( Arrays.asList( new Long[]{ 48998761234L } ) );

    @Override
    public void run( String... args ) throws Exception {

        System.out.println( "Mensagem enviada por: " + nome
                            + "\nE-mail:" + email
                            + "\nCom telefones para contato: " + telefones );
        System.out.println( "Seu cadastro foi aprovado" );

    }

}
