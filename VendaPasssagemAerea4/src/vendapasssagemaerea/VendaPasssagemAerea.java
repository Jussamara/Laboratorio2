package vendapasssagemaerea;

import java.text.ParseException;
import view.MainUI;

/**
 *
 * @author mariana01
 */
public class VendaPasssagemAerea {

    /**
     * Inicia a classe static void main
     *
     * @param args
     * @throws java.text.ParseException Executa a view mainUI que irá acessar
     * MainMenu
     */
    public static void main(String[] args) throws ParseException {
        new MainUI().executar();
    }
}
