package view;

import Repositorio.RepositorioCliente;
import Repositorio.RepositorioVenda;
import Repositorio.RepositorioVoo;
import java.util.Date;
import model.Cliente;
import model.Venda;
import model.Voo;
import util.Console;
import view.menu.VendaMenu;

/**
 * Essa classe contém os métodos para vendas.
 *
 * @author mariana01
 */
public class VendasUI {

    RepositorioVenda vendas;
    RepositorioCliente clientes;
    RepositorioVoo voos;

    /**
     * Inicia a classe VendaUI com seus dados Vendas e recebe Vendas. clientes e
     * recebe a lista de clientes, Voos e recebe voo.
     */
    VendasUI(RepositorioCliente Clientes, RepositorioVenda listaPassagens, RepositorioVoo voo) {
        this.clientes = Clientes;
        this.vendas = listaPassagens;
        this.voos = voo;
    }

    /**
     * Esse método executa e acessa o submenu VendaMenu e suas opções.
     *
     * @author mariana01
     */
    public void executar() {
        int opcao = 0;
        do {
            VendaMenu.mostrarMenu();
            opcao = Console.scanInt("Digite aqui sua opção: ");
            switch (opcao) {
                case VendaMenu.OP_CADASTRAR:
                    cadastrar();
                    break;
                case VendaMenu.OP_LISTAR:
                    listarPassagensVendidas();
                    break;
                case VendaMenu.OP_VOLTAR:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida...");
            }
        } while (opcao != VendaMenu.OP_VOLTAR);
    }

    /**
     * Esse método cadastra uma nova venda na lista de vendas.
     *
     * @author mariana01
     */
    public void cadastrar() {
        //Relaciona o cliente com a venda através do rg:
        String idCliente = Console.scanString("Digite o RG do passageiro: ");
        Cliente comprador = null;
        if (clientes.clienteExiste(idCliente)) {
            comprador = clientes.buscarCliente(idCliente);
        } else {
            System.out.println("Cliente não encontrado...");
        }
        new VooUI(voos).listarVoos();
        Voo vooSelecionado;
        int idVoo = Console.scanInt("Digite o código do voo: ");
        if (voos.vooExiste(idVoo)) {
            vooSelecionado = voos.buscarVoo(idVoo);
            Date atual = new Date();
            int posto = Console.scanInt("Digite Lugar aviao: ");
            if (vooSelecionado.assentoDisponivel(posto)) {
                vendas.addVendaPassagem(new Venda(comprador, vooSelecionado, atual, posto));
            System.out.println("Venda cadastrada com sucesso...");
               
            } else {
                System.out.print("Nao a lugar disponivel procure outro Voo !!!");
            }
            
        } else {
            System.out.println("Voo não encontrado!!!");
        }
    }

    /**
     * Esse método lista as Passagens vendidas.
     *
     * @author mariana01
     */
    public void listarPassagensVendidas() {
        for (Venda v : vendas.getListaPassagens()) {
            System.out.println("------------------");
            System.out.println(v);
            System.out.println("------------------");
        }

    }
}
