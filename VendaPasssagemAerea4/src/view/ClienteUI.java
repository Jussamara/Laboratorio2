package view;

import Repositorio.RepositorioCliente;
import model.Cliente;
import util.Console;
import view.menu.ClienteMenu;

/**
 * Essa classe contém os métodos para Cliente.
 *
 * @author mariana01
 */
public class ClienteUI {

    private RepositorioCliente lista;

    /**
     * Inicia a classe ClienteUI com seus dados e recebe a lista.
     */
    public ClienteUI(RepositorioCliente lista) {
        this.lista = lista;
    }

    /**
     * Esse método executar acessa o submenu ClienteMenu e suas opções.
     *
     * @author mariana01
     */
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

    /**
     * Esse método cadastra um novo Cliente na lista de clientes.
     *
     * @author mariana01
     */
    private void cadastrarCliente() {
        String rg = Console.scanString("RG: ");
        if (lista.clienteExiste(rg)) {
            System.out.println("RG já existente no cadastro");
        } else {
            String nome = Console.scanString("Nome: ");
            String telefone = Console.scanString("Telefone: ");
            lista.addClientes(new Cliente(rg, nome, telefone));
            System.out.println("Cliente " + nome + " cadastrado com sucesso!");
        }
    }

    /**
     * Esse método lista os Clientes cadastrados da lista de Clientes.
     *
     * @author mariana01
     */
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