package view.menu;

/**
 * Essa classe VooMenu acessa as opções do submenu.
 *
 * @author mariana01
 */
public class VooMenu {

    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;
    public static final int OP_VOLTAR = 0;

    public static String getOpcoes() {
        return ("\n========================================\n"
                + "1- Cadastrar Voo\n"
                + "2- Listar Voos\n"
                + "0- Voltar"
                + "\n=========================================\n");

    }
}
