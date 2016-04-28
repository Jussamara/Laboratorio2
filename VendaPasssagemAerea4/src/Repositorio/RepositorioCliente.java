package Repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 * Essa classe contém os repositórios para Cliente.
 *
 * @author mariana01
 */
public class RepositorioCliente {

    private List<Cliente> clientes;

    /**
     * Inicia o repositório Cliente com seus dados. listaCliente e recebe
     * ArrayList
     */
    public RepositorioCliente() {
        clientes = new ArrayList<Cliente>();

    }

    /**
     * Esse método adiciona Cliente na lista de Clientes.
     *
     * @author mariana01
     */
    public boolean addClientes(Cliente cliente) {
        return (clientes.add(cliente));
    }

    /**
     * Esse método mostra lista de Clientes.
     *
     * @author mariana01
     */
    public List<Cliente> getListaClientes() {
        return clientes;
    }

    /**
     * Esse método verifica se existe um rg especifico na lista de Clientes.
     *
     * @author mariana01
     */
    public boolean clienteExiste(String rg) {
        for (Cliente cliente : clientes) {
            if (cliente.getRg().equals(rg)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Esse método busca um rg na lista de Clientes e retorna um Cliente.
     *
     * @@author mariana01
     */
    public Cliente buscarCliente(String rg) {
        for (Cliente cliente : clientes) {
            if (cliente.getRg().equalsIgnoreCase(rg)) {
                return cliente;
            }
        }
        return null;
    }
}
