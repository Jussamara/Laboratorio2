package view;

import Repositorio.RepositorioAviao;
import model.Avioes;
import util.Console;
import view.menu.AviaoMenu;

/**
 * Essa classe contém os métodos para Aviao.
 *
 * @author mariana01
 */
public class AviaoUI {

    private RepositorioAviao lista;

    /**
     * Inicia a classe AviaoUI com seus dados. listaAviao recebe a lista.
     */
    public AviaoUI(RepositorioAviao lista) {
        this.lista = lista;
    }

    /**
     * Esse método executar acessa o submenu AviaoMenu e suas opções.
     *
     * @author mariana01
     */
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

    /**
     * Esse método cadastra um novo Avião na lista de Avioes.
     *
     * @author mariana01
     */
    private void cadastrarAviao() {

        String nomeaviao = Console.scanString("Nome do Aviao: ");
        int assentos = Console.scanInt("Quantidade de assentos: ");
        lista.addAvioes(new Avioes(nomeaviao, assentos));
        System.out.println("Aviao " + nomeaviao + " cadastrado com sucesso!");

    }

    /**
     * Esse método lista os Aviões cadastrados da lista de Avioes.
     *
     * @author mariana01
     */
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
