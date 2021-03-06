package view.menu;

/**
 * Essa classe AviaoMenu acessa as opções do submenu.
 *
 * @author mariana01
 */
public class AviaoMenu {

    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;
    public static final int OP_VOLTAR = 0;

    public static String getOpcoes() {
        return ("\n--------------------------------------\n"
                + "1- Cadastrar Aviao\n"
                + "2- Listar Avioes\n"
                + "0- Voltar"
                + "\n--------------------------------------");
    }
}
