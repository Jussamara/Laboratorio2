package model;

/**
 * Essa classe serve para trabalhar com o objeto Aviões. Trabalha com
 * informações: código, nomeaviao, qtdassentos;.
 *
 * @author mariana01
 */
public class Avioes {

    private static int codigo_Gerado = 1;
    private int codigo;
    private String nomeaviao;
    private int qtdassentos;

    /**
     * Inicia o objeto Avioes com seus dados.
     *
     * @codigo Código voltado para receber o código gerado do avião.
     *
     * @param nomeaviao String que referencia o atributo nome do aviao.
     * @param qtdassentos inteiros que referencia o atributo qtdassentos do
     * avião.
     */
    @Override
    public String toString() {
        return "Aviao da " + nomeaviao + "[ codigo: " + codigo + ", qtdassentos=" + qtdassentos + ']';
    }

    public Avioes(String nomeaviao, int qtdassentos) {
        this.codigo = gerarCodigo();
        this.nomeaviao = nomeaviao;
        this.qtdassentos = qtdassentos;

    }

    /**
     * Gera o código de um Avião.
     *
     * @return código de um Avião.
     */
    public int gerarCodigo() {
        return (codigo_Gerado++);
    }

    /**
     * Retorna a quantidade de assentos do Avião.
     *
     * @return inteiro qtdassentos.
     */
    public int getQtdassentos() {
        return qtdassentos;
    }

    /**
     * Retorna o código de um Avião.
     *
     * @return código de um Avião.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Altera o codigo de um Avião.
     *
     * @param codigo int codigo.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Retorna o nome de um Avião.
     *
     * @return nomeaviao.
     */
    public String getNomeaviao() {
        return nomeaviao;
    }

    /**
     * Altera o nome de um Avião.
     *
     * @param nomeaviao String nomeaviao.
     */
    public void setNomeaviao(String nomeaviao) {
        this.nomeaviao = nomeaviao;
    }
}
