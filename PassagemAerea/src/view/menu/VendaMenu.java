package view.menu;

/**
 * Essa classe VendaMenu acessa as opções do submenu.
 *
 * @author mariana01
 */
public class VendaMenu {

    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;
    public static final int OP_VOLTAR = 0;

    public static void mostrarMenu() {
        System.out.println("\n--------------------------------------\n"
                + "1- Cadastrar Venda de Passagem\n"
                + "2- Listar Passagens Vendidas\n"
                + "0- Voltar"
                + "\n--------------------------------------");
    }
}
