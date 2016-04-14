
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

    public Voo(Date horario, Avioes aviao, String origem, String destino) {
        this.codigo = codigo_Gerado;
        codigo_Gerado++;
        this.horario = horario;
        this.aviao = aviao;
        this.origem = origem;
        this.destino = destino;
        this.qtdDisponivel=aviao.getQtdassentos();
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getHorario() {
        return horario;
    }

    public Avioes getAvioes() {
        return aviao;
    }

    public void setAvioes(Avioes aviao) {
        this.aviao = aviao;
    }
     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    } 
      public static int getCodigo_Gerado() {
        return codigo_Gerado;
    }
      public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdComprada) {
        if(qtdComprada <= qtdDisponivel){
           this.qtdDisponivel = qtdDisponivel-qtdComprada; 
        }
        else{
            System.out.println("Voo Completo!!!");
        }
    }
    
    public boolean assentoDisponivel(int qtdComprada){
        boolean check=false;
          if(qtdComprada <= qtdDisponivel){
           this.qtdDisponivel = qtdDisponivel-qtdComprada;
           check=true;
        }
           else{
            System.out.println("Voo Completo!!!");
        }
        
        return check;
       
        
    }
  

    @Override
    public int compareTo(Voo hv) {
        return(this.getHorario().compareTo(hv.getHorario()));
    }
   /* private Assentos assentos[] = new Assentos[indice];
    
        public boolean adicionaCliente(int lugar, Cliente c){
        if(lugar<this.assentos.length & lugar>=0){
            if(assentos[lugar]==null){//o lugar esta vazio
                Assentos a = new Assentos();//criar assento
                a.setCliente(c);//adiciono uma pessoa lugar fica ocupado.
                this.assentos[lugar]=a;//adiciona no arrei de assentos
                return true;
            }
            else{
                return false;
                
            } 
        }   
        else{
                 return false;
                    }     
    }

    public String listarCliente(){
        String lista ="";
        for(int cont=0;cont< this.assentos.length; cont++){//contador de assentos
            if (assentos[cont]!=null);//o assento esta ocupado
            
            lista+="Clienes "+assentos[cont].getCliente().getNome()+"Assento "+(cont+1)+"\n";//add na lista
        }
        return lista;
    }
    */
}
