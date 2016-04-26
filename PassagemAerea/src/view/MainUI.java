package view;

import Repositorio.RepositorioAviao;
import Repositorio.RepositorioCliente;
import Repositorio.RepositorioVenda;
import Repositorio.RepositorioVoo;
import java.text.ParseException;
import util.Console;
import view.menu.MainMenu;

/**
 * Essa classe acessa o menu principal e os submenus.
 *
 * @author mariana01
 */
public class MainUI {

    private RepositorioCliente Clientes;
    private RepositorioAviao listaAvioes;
    private RepositorioVoo voo;
    private RepositorioVenda listaPassagens;

    /**
     * Inicia a classe MainUI com seus dados. listaClientes recebe
     * RepositorioCliente. listaAvioes recebe RepositorioAviao. listaVoo recebe
     * RepositorioVoo. listaPassagens e recebe RepositorioVenda
     */
    public MainUI() {
        Clientes = new RepositorioCliente();
        listaAvioes = new RepositorioAviao();
        voo = new RepositorioVoo();
        listaPassagens = new RepositorioVenda();
    }

    /**
     * Esse método acessa e executa o menu principal MainMenu e suas opções.
     *
     * @author mariana01
     */
    public void executar() throws ParseException {

        int opcao = 0;
        do {
            System.out.println(MainMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
            switch (opcao) {
                case MainMenu.OP_CLIENTES:
                    new ClienteUI(Clientes).executar();
                    break;
                case MainMenu.OP_AVIOES:
                    new AviaoUI(listaAvioes).executar();
                    break;
                case MainMenu.OP_VOOS:
                    new VooUI(listaAvioes, voo).executar();
                    break;
                case MainMenu.OP_VENDAS:
                    new VendasUI(Clientes, listaPassagens, voo).executar();
                    break;
                case MainMenu.OP_RELATORIOVENDAS:
                    new RelatorioUI(listaPassagens).executar();
                    break;
                case MainMenu.OP_SAIR:
                    System.out.println("Aplicação finalizada!!!");
                    break;
                default:
                    System.out.println("Opção inválida..");

            }
        } while (opcao != MainMenu.OP_SAIR);
    }
}
