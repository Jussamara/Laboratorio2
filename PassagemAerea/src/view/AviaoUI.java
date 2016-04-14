
package view;
import model.Avioes;
import Repositorio.RepositorioAviao;
import util.Console;
import view.menu.AviaoMenu;

public class AviaoUI {
    
      private RepositorioAviao lista;
      
      public AviaoUI(RepositorioAviao lista) {
        this.lista = lista;
    }
       public void executar() {
        int opcao = 0;
        do {
            System.out.println(AviaoMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
            switch (opcao) {
                case AviaoMenu.OP_CADASTRAR:
                    cadastrarAviao();
                    break;
                case AviaoMenu.OP_LISTAR:
                    mostrarAvioes();
                    break;
                case AviaoMenu.OP_VOLTAR:
                    System.out.println("Retornando ao menu principal..");
                    break;
                default:
                    System.out.println("Opção inválida..");

            }
        } while (opcao != AviaoMenu.OP_VOLTAR);
    }
         private void cadastrarAviao() {
          
            String nomeaviao = Console.scanString("Nome do Aviao: ");
            int assentos= Console.scanInt("Quantidade de assentos: ");
            lista.addAvioes(new Avioes(nomeaviao, assentos));
                System.out.println("Aviao " + nomeaviao + " cadastrado com sucesso!");
             
    }
         public void mostrarAvioes() {
        System.out.println("-----------------------------\n");
        System.out.println(String.format("%-10s", "CODIGO") + "\t"
                + String.format("%-20s", "|NOME DO AVIAO") + "\t"
                + String.format("%-10s", "|QTD DE ASSENTOS"));
                    for (Avioes cliente : lista.getListaAvioes()) {
                        System.out.println(String.format("%-10s", cliente.getCodigo()) + "\t"
                                + String.format("%-20s", "|" + cliente.getNomeaviao()) + "\t"
                                + String.format("%-10s", "|" + cliente.getQtdassentos()));
                    }

    }

     
}
