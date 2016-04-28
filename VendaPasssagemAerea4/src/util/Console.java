package util;

/**
 * Essa classe serve para trabalhar com os tipos de parâmetros (String, int,
 * double, float, boolean, char).
 *
 * @author mariana01
 */
import java.util.Scanner;

public class Console {

    /**
     * Esse método serve para trabalhar com o tipo de parâmetro String.
     *
     * @author mariana01
     */
    public static String scanString(Object out) {
        System.out.print(out);
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextLine());
    }

    /**
     * Esse método serve para trabalhar com o tipo de parâmetro Inteiro.
     *
     * @author mariana01
     */
    public static int scanInt(Object out) {
        System.out.print(out);
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextInt());
    }

    /**
     * Esse método serve para trabalhar com o tipo de parâmetro Double.
     *
     * @author mariana01
     */
    public static double scanDouble(Object out) {
        System.out.print(out);
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextDouble());
    }

    /**
     * Esse método serve para trabalhar com o tipo de parâmetro Float.
     *
     * @author mariana01
     */
    public static float scanFloat(Object out) {
        System.out.print(out);
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextFloat());
    }

    /**
     * Esse método serve para trabalhar com o tipo de parâmetro Boleano.
     *
     * @author mariana01
     */
    public static boolean scanBoolean(Object out) {
        System.out.print(out);
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextBoolean());
    }

    /**
     * Esse método serve para trabalhar com o tipo de parâmetro
     * Char(caracteres).
     *
     * @author mariana01
     */
    public static char scanChar(Object out) {
        System.out.print(out);
        Scanner scanner = new Scanner(System.in);
        return (scanner.next().charAt(0));
    }
}
