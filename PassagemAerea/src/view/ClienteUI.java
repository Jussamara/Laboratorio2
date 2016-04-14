
package view;


import model.Cliente;
import Repositorio.RepositorioCliente;
import util.Console;
import view.menu.ClienteMenu;


public class ClienteUI {
    


    private RepositorioCliente lista;

    public ClienteUI(RepositorioCliente lista) {
        this.lista = lista;
    }

    public void executar() {
        int opcao = 0;
        do {
            System.out.println(ClienteMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
            switch (opcao) {
                case ClienteMenu.OP_CADASTRAR:
                    cadastrarCliente();
                    break;
                case ClienteMenu.OP_LISTAR:
                    mostrarClientes();
                    break;
                case ClienteMenu.OP_VOLTAR:
                    System.out.println("Retornando ao menu principal..");
                    break;
                default:
                    System.out.println("Opção inválida..");

            }
        } while (opcao != ClienteMenu.OP_VOLTAR);
    }

    private void cadastrarCliente() {
        String rg = Console.scanString("RG: ");
        if (lista.clienteExiste(rg)) {
            System.out.println("RG já existente no cadastro");
        } else {
            String nome = Console.scanString("Nome: ");
            String telefone= Console.scanString("Telefone: ");
            lista.addClientes(new Cliente(rg, nome, telefone));
                System.out.println("Cliente " + nome + " cadastrado com sucesso!");
            } 
    }


public void mostrarClientes() {
        System.out.println("-----------------------------\n");
        System.out.println(String.format("%-10s", "RG") + "\t"
                + String.format("%-20s", "|NOME") + "\t"
                + String.format("%-20s", "|TELEFONE"));
                for (Cliente cliente : lista.getListaClientes()) {
                    System.out.println(String.format("%-10s", cliente.getRg()) + "\t"
                            + String.format("%-20s", "|" + cliente.getNome()) + "\t"
                            + String.format("%-20s", "|" + cliente.getTelefone()));
                }

    }

}