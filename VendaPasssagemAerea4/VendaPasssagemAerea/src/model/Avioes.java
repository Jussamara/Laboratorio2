/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Acer
 */
public class Avioes {
    private static int CODIGO_GERADO = 1;
    private int codigo;
    private String nomeaviao;
    private int qtdassentos;

    public Avioes(int codigo, String nomeaviao, int qtdassentos) {
        this.codigo = CODIGO_GERADO;//generateCodigo();
        CODIGO_GERADO++;
        this.codigo = codigo;
        this.nomeaviao = nomeaviao;
        this.qtdassentos = qtdassentos;
    }
    private int generateCodigo() {
        return (CODIGO_GERADO++);
   }

    

    public int getCodigo() {
        return codigo;
    }

    public String getNomeaviao() {
        return nomeaviao;
    }

    public int getQtdassentos() {
        return qtdassentos;
    }

    @Override
    public String toString() {
        return "Avioes{" + "codigo=" + codigo + ", nomeaviao=" + nomeaviao + ", qtdassentos=" + qtdassentos + '}';
    }
    
}
