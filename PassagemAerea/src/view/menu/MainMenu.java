
package view.menu;


public class MainMenu {
    public static final int OP_CLIENTES = 1;
    public static final int OP_AVIOES = 2;
    public static final int OP_VOOS = 3;
    public static final int OP_VENDAS = 4;
    public static final int OP_RELATORIOVENDAS = 5;
    public static final int OP_SAIR = 0;

    public static String getOpcoes() {
        return ("\n--------------------------------------\n"
                + "1- Cadastrar Passageiros\n"
                + "2- Cadastrar Avião\n"
                + "3- Registrar Voos\n"
                + "4- Vender Passagens\n"
                + "5- Menu Relatorio Vendas\n"
                + "0- Sair da Aplicação"
                + "\n--------------------------------------");
    }
    
}
 