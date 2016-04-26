package model;

import java.util.Date;
import util.DateUtil;

public class Venda {

    private static int codigo_Gerado = 1;
    private int codigo;
    private Cliente cliente;
    private Voo voo;
    private Date horaCompra;
    private int qtdcomprada;

    /**
     * Inicia o objeto venda com seus dados.
     *
     * @param codigo Objeto codigo voltado para especificar um códigp de uma
     * venda.
     * @param Cliente Objeto cliente que vem da classe cliente voltado para
     * especificar um cliente de uma venda.
     * @param voo Objeto voo que vem da classe Voo voltado para especificar um
     * voo de uma venda.
     * @param Date Objeto horaCompra que vem da classe Date voltado para
     * especificar uma data e horario de uma Compra.
     * @param qtdcomprada inteiro que referencia o atributo quantidade de
     * passagens por venda.
     */
    public Venda(Cliente cliente, Voo voo, Date horaVoo, int qtdcomprada) {
        this.codigo = codigo_Gerado;
        codigo_Gerado++;
        this.cliente = cliente;
        this.voo = voo;
        this.horaCompra = horaVoo;
        this.qtdcomprada = qtdcomprada;

    }

    /**
     * Retorna a Quantidade de uma venda
     *
     * @return objeto Qtdcomprada da venda
     */
    public int getQtdcomprada() {
        return qtdcomprada;
    }

    /**
     * Retorna o Cliente de uma venda
     *
     * @return objeto cliente da venda
     */
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Retorna o Voo de uma venda
     *
     * @return objeto voo da venda
     */
    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    /**
     * Retorna a hora de uma venda
     *
     * @return objeto horaCompra da venda
     */
    public Date getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(Date horaCompra) {
        this.horaCompra = horaCompra;
    }

    /**
     * Retorna o codigo de uma venda
     *
     * @return objeto codigo da venda
     */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Retorna o codigo gerado automaticamente de uma venda
     *
     * @return objeto codigo_Gerado da venda
     */
    public static int getCodigo_Gerado() {
        return codigo_Gerado;
    }

    /**
     * Retorna a venda com a hora da venda,código,nome do passageiro,nome do
     * avião e QtdDisponivel.
     *
     * @return venda
     */
    @Override
    public String toString() {
        String horaVendida = DateUtil.dateHourToString(horaCompra);
        String venda = " Código de Venda: " + this.codigo + " Horario: " + horaVendida
                + "\n Nome do Passageiro: " + cliente.getNome()+" Comprou "+getQtdcomprada()+" passagens neste voo"
                + "\n Voo: " + voo.getAvioes().getNomeaviao() + " Codigo: " + voo.getAvioes().getCodigo()
                +"\n  Assentos disponiveis neste voo:"+voo.getQtdDisponivel()+"\n";
        return venda;
    }
}
