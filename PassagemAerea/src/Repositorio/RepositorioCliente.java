
package Repositorio;

import java.util.ArrayList;
import model.Cliente;
import java.util.List;


public class RepositorioCliente {
      private List<Cliente> clientes;
  
    
    public RepositorioCliente(){
       clientes = new ArrayList<Cliente>();
      
    }
     public boolean addClientes(Cliente cliente) {
        return (clientes.add(cliente));
    }
     
    public List<Cliente> getListaClientes() {
        return clientes;
    }

    public boolean clienteExiste(String rg) {
        for (Cliente cliente : clientes) {
            if (cliente.getRg().equals(rg)) {
                return true;
            }
        }
        return false;
    }

    public Cliente buscarCliente(String rg) {
        for (Cliente cliente : clientes) {
            if (cliente.getRg().equalsIgnoreCase(rg)) {
                return cliente;
           }
        }
        return null;
    }
  
   
}
