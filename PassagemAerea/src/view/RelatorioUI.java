
package view;

import Repositorio.RepositorioVenda;
import Repositorio.RepositorioVoo;
import java.awt.BorderLayout;
import util.Console;
import view.menu.RelatorioMenu;
import view.menu.VendaMenu;
import model.Venda;
import model.Voo;

public class RelatorioUI {
    private RepositorioVenda vendas;
    

 public RelatorioUI(RepositorioVenda listaPassagens) {
       this.vendas=listaPassagens; 
    }
    public void executar() {
        int opcao = 0;
        do {
            RelatorioMenu.mostrarMenu();
            opcao = Console.scanInt("Digite aqui sua opção: ");
            switch (opcao) {
                case RelatorioMenu.OP_VisualizaPorCliente:
                    VizualizaCliente();
                    break;
                case RelatorioMenu.VisualizaPorPassageiro:
                    vizualizaPassagensVendidas();
                    break;
                case RelatorioMenu.VisualizaPorOrigem:
                    ListarPorOrigem();
                    break;
                    case RelatorioMenu.VisualizaPorDestino:
                    listarPorDestino();
                    break;
                    case RelatorioMenu.VisualizaPorPeriodoDeVoo:
                    listarPorPeriodoVoo();
                    break;
                default:
                    System.out.println("Opção inválida...");
            }
        } while (opcao != VendaMenu.OP_VOLTAR);
    }

    private void VizualizaCliente() {
            String rg = Console.scanString(" Digite o RG da pesquisa: ");
            System.out.println("\n Este cliente comprou a(s) passagem(ns):");
                for (Venda vendidas : vendas.getListaPassagens()) {
                    if (vendidas.getCliente().getRg().equalsIgnoreCase(rg)) {
                        System.out.println(vendidas);
            }
        }
    }

    private void vizualizaPassagensVendidas() {
        System.out.println("Falta metodo");
                
    }

    private void ListarPorOrigem() {
         String origem = Console.scanString("Digite a origem do Voo: ");
         System.out.println("Passagens Vendidas com essa origem: ");
            for (Venda vendidas : vendas.getListaPassagens()) {
              if (vendidas.getVoo().getOrigem().equalsIgnoreCase(origem)) {
                    System.out.println(vendidas);
                }
        }
    }

    private void listarPorDestino() {
            
       // RepositorioVoo voo = new RepositorioVoo();
        String destino = Console.scanString("Digite o destino: ");
       // if (voo.getListaHorarios(destino)) {
            System.out.println("Passagens vendidas com esse destino");
            for (Venda vendidas : vendas.getListaPassagens()) {
                if (vendidas.getVoo().getDestino().equalsIgnoreCase(destino)) {
                    System.out.println(vendidas);
                }
            }
        } 
        
    private void listarPorPeriodoVoo() {
         int idVoo = Console.scanInt("Digite o código de voo que deseja relatório: ");
          System.out.println("Listade voos com passagem vendidas: ");
         for (Venda vendidas : vendas.getListaPassagens()) {
            if (vendidas.getVoo().getCodigo() == idVoo) {
                System.out.println(vendidas);
            }
        }
    
    }
}
