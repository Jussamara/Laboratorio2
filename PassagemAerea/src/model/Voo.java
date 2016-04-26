package model;

import java.util.Date;

public class Voo implements Comparable<Voo> {

    private static int codigo_Gerado = 1;
    private int codigo;
    private Date horario;
    private Avioes aviao;
    private String origem;
    private String destino;
    private int qtdDisponivel;

    /**
     * Inicia o objeto voo com seus dados.
     *
     * @param codigo Objeto codigo voltado para especificar um código de um voo.
     * @param origem Objeto origem voltado para especificar a origem do voo.
     * @param destino Objeto destino voltado para especificar o destino do voo.
     * @param Avioes Objeto aviao que vem da classe Avioes voltado para
     * especificar um Aviao de um voo.
     * @param Date Objeto horario que vem da classe Date voltado para
     * especificar uma data e horario de um voo.
     * @param qtdDisponivel inteiro que referencia o atributo quantidade
     * disponível de passagens por voo.
     */
    public Voo(Date horario, Avioes aviao, String origem, String destino) {
        this.codigo = codigo_Gerado;
        codigo_Gerado++;
        this.horario = horario;
        this.aviao = aviao;
        this.origem = origem;
        this.destino = destino;
        this.qtdDisponivel = aviao.getQtdassentos();
    }

    /**
     * Retorna a Origem de um voo
     *
     * @return objeto Origem do voo.
     */
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    /**
     * Retorna o Destino de um voo
     *
     * @return objeto Destino do voo.
     */
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Retorna o horario de um voo
     *
     * @return objeto horario do voo.
     */
    public Date getHorario() {
        return horario;
    }

    /**
     * Retorna o avião de um voo
     *
     * @return objeto aviao do voo.
     */
    public Avioes getAvioes() {
        return aviao;
    }

    public void setAvioes(Avioes aviao) {
        this.aviao = aviao;
    }

    /**
     * Retorna o codigo de um voo
     *
     * @return objeto codigo do voo
     */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getCodigo_Gerado() {
        return codigo_Gerado;
    }

    /**
     * Retorna a quantidade disponivel de lugares de um voo
     *
     * @return objeto qtdDisponivel do voo
     */
    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdComprada) {
        if (qtdComprada <= qtdDisponivel) {
            this.qtdDisponivel = qtdDisponivel - qtdComprada;
        } else {
            System.out.println("Voo Completo!!!");
        }
    }

    /**
     * Verifica a quantidade disponivel de lugares de um voo
     *
     * @return objeto qtdDisponivel menos a qtdComprada do voo
     */
    public boolean assentoDisponivel(int qtdComprada) {
        boolean check = false;
        if (qtdComprada <= qtdDisponivel) {
            this.qtdDisponivel = qtdDisponivel - qtdComprada;
            check = true;
        } else {
            System.out.println("Voo Completo!!!");
        }

        return check;


    }

    /**
     * Compara o voo com a hora do voo
     *
     * @return objeto horario do voo
     */
    @Override
    public int compareTo(Voo hv) {
        return (this.getHorario().compareTo(hv.getHorario()));
    }
}
