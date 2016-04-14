
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

      public Venda(Cliente cliente, Voo voo, Date horaVoo,int qtdcomprada){
        this.codigo = codigo_Gerado;
        codigo_Gerado++;
        this.cliente = cliente;
        this.voo = voo;
        this.horaCompra = horaVoo;
        this.qtdcomprada=qtdcomprada;
        
    }
         public int getQtdcomprada() {
        return qtdcomprada;
    }
 

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Date getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(Date horaCompra) {
        this.horaCompra = horaCompra;
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
    
  
    
    @Override
    public String toString() {
        String horaVendida = DateUtil.dateHourToString(horaCompra);
        String venda = " Código de Venda: " + this.codigo + " Horario: " + horaVendida
                + "\n Nome do Passageiro: " + cliente.getNome()
                + "\n Voo: " + voo.getAvioes().getNomeaviao()+" Codigo: "+voo.getAvioes().getCodigo()
                +"\n  Poltrona numero:"+voo.getQtdDisponivel()+"\n";
        return venda;
    }
}
