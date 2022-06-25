package gPatterns.Spring.service;

import gPatterns.Spring.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente.
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId( Long id );

    void inserir( Cliente cliente );

    void atualizar( Long id, Cliente cliente );

    void deletar( Long id );

}
