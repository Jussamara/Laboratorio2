
package model;


public class Avioes {
    private static int codigo_Gerado = 1;
    private int codigo;
    private String nomeaviao;
    private int qtdassentos;

    @Override
    public String toString() {
        return "Aviao da " + nomeaviao + "[ codigo: " + codigo + ", qtdassentos=" + qtdassentos + ']';
    }

    public Avioes(String nomeaviao, int qtdassentos) {
        this.codigo = gerarCodigo();
        this.nomeaviao = nomeaviao;
        this.qtdassentos = qtdassentos;
        
    }
      public int gerarCodigo(){
        return (codigo_Gerado++);
    }

    public int getQtdassentos() {
        return qtdassentos;
    }
   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeaviao() {
        return nomeaviao;
    }

    public void setNomeaviao(String nomeaviao) {
        this.nomeaviao = nomeaviao;
    }


    
}
