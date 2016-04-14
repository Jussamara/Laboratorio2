
package view;
import Repositorio.RepositorioCliente;
import Repositorio.RepositorioAviao;
import Repositorio.RepositorioVenda;
import Repositorio.RepositorioVoo;
import util.Console;
import view.menu.MainMenu;
/**
 *
 * @author Jussamara
 */
public class MainUI {
       private RepositorioCliente Clientes; 
       private RepositorioAviao listaAvioes;
       private RepositorioVoo voo;
       private RepositorioVenda listaPassagens;
   
       public MainUI() {
        Clientes = new RepositorioCliente();
        listaAvioes = new RepositorioAviao();
        voo = new RepositorioVoo();
        listaPassagens = new RepositorioVenda();
    }
        public void executar() {
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
                    new VendasUI( Clientes, listaPassagens,  voo  ).executar();
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
