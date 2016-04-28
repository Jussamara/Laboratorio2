package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Essa classe serve para verificar e formatar data e hora.
 *
 * @author mariana01
 */
public class DateUtil {

    /**
     * Esse método serve para receber String data.
     *
     * @author mariana01
     */
    public static Date stringToDate(String data) throws ParseException {
        return (new SimpleDateFormat("dd/MM/yyyy").parse(data));
    }

    /**
     * Esse método serve para receber String data e hora.
     *
     * @author mariana01
     */
    public static Date stringToDateHour(String data) throws ParseException {
        return (new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data));
    }

    public static String dateToString(Date data) {
        return (new SimpleDateFormat("dd/MM/yyyy").format(data));
    }

    /**
     * Esse método serve para formatar String data e hora no padrão brasileiro.
     *
     * @author mariana01
     */
    public static String dateHourToString(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataString = formatador.format(data);
        return (dataString);
    }

    /**
     * Esse método serve para formatar verificar padrão de data (00/00/0000).
     *
     * @author mariana01
     */
    public static boolean verificaData(String data) {
        return (data.matches("\\d{2}/\\d{2}/\\d{4}"));
    }

    /**
     * Esse método serve para formatar verificar padrão de data e hora
     * (00/00/0000 - 00:00).
     *
     * @author mariana01
     */
    public static boolean verificaDataHora(String data) {
        return (data.matches("\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}"));
    }
}
