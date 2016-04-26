package view;

import Repositorio.RepositorioVenda;
import java.text.ParseException;
import java.util.InputMismatchException;
import model.Venda;
import util.Console;
import view.menu.RelatorioMenu;
import view.menu.VendaMenu;

/**
 * Essa classe contém os métodos para relatórios.
 *
 * @author mariana01
 */
public class RelatorioUI {

    private RepositorioVenda vendas;

    /**
     * Inicia a classe RelatorioUI com seus dados. lista as Vendas e recebe
     * Vendas.
     */
    public RelatorioUI(RepositorioVenda listaPassagens) {
        this.vendas = listaPassagens;
    }

    /**
     * Esse método executa e acessa o submenu RelatorioMenu e suas opções.
     *
     * @author mariana01
     */
    public void executar() throws ParseException {
        int opcao = 0;
        do {
            try {
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
            } catch (InputMismatchException ime) {
                System.out.println("Opção Inválida! Não pode digitar letras ou caracteres especiais!");
            }
        } while (opcao != VendaMenu.OP_VOLTAR);
    }

    /**
     * Esse método lista as vendas por Clientes através da busca pelo rg.
     *
     * @author mariana01
     */
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
         System.out.println("Passagens Vendidas ");
        for (Venda vendidas : vendas.getListaPassagens()) {
                   System.out.println(vendidas);
       } 

    }

    /**
     * Esse método lista as vendas por origem cadastradas na lista de vendas.
     *
     * @author mariana01
     */
    private void ListarPorOrigem() {
        String origem = Console.scanString("Digite a origem do Voo: ");
        System.out.println("Passagens Vendidas com essa origem: ");
        for (Venda vendidas : vendas.getListaPassagens()) {
            if (vendidas.getVoo().getOrigem().equalsIgnoreCase(origem)) {
                System.out.println(vendidas);
            }
        }
    }

    /**
     * Esse método lista as vendas por destino cadastradas na lista de vendas.
     *
     * @author mariana01
     */
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

    /**
     * Esse método lista as vendas por períodos cadastradas na lista de vendas.
     *
     * @author mariana01
     */
    private void listarPorPeriodoVoo() {
        int idVoo = Console.scanInt("Digite o código de voo que deseja relatório: ");
        System.out.println("Lista de voos com passagem vendidas: ");
        for (Venda vendidas : vendas.getListaPassagens()) {
            if (vendidas.getVoo().getCodigo() == idVoo) {
                System.out.println(vendidas);
            }
        }

    }
}
