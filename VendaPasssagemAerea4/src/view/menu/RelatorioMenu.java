package view.menu;

/**
 * Essa classe RelatorioMenu acessa as opções do submenu.
 *
 * @author mariana01
 */
public class RelatorioMenu {

    public static final int OP_VisualizaPorCliente = 1;
    public static final int VisualizaPorPassageiro = 2;
    public static final int VisualizaPorOrigem = 3;
    public static final int VisualizaPorDestino = 4;
    public static final int VisualizaPorPeriodoDeVoo = 5;
    public static final int SAIR = 0;

    public static void mostrarMenu() {
        System.out.println("\n--------------------------------------\n"
                + "1- Visualizar Relatório por Cliente\n"
                + "2- Visualizar Relatório por Passageiro\n"
                + "3- Visualizar Relatório por Origem\n"
                + "4- Visualizar Relatório por Destino\n"
                + "5- Visualizar Relatório por Periodo de Vôo\n"
                + "0- Sair da Aplicação"
                + "\n--------------------------------------");
    }
}
