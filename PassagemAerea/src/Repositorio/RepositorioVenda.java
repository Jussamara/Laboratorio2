
package Repositorio;



    
import java.util.List;
import model.Venda;
import java.util.ArrayList;

public class RepositorioVenda {
    private List<Venda> listaPassagens;
    
    public RepositorioVenda(){
        listaPassagens = new ArrayList<Venda>();
    }
    
    public boolean addVendaPassagem(Venda passagem){
        return (listaPassagens.add(passagem));
    }
    
    public List<Venda>getListaPassagens(){
        return listaPassagens;
    }
    
    public boolean passagemExiste(int codigo){
        for (Venda listaPassagem : listaPassagens) {
            if(listaPassagem.getCodigo()==codigo){
                return true;
            }
        }
        return false;
    }
    
    public Venda buscaPassagem(int codigo){
        for (Venda listaPassagem : listaPassagens) {
            if(listaPassagem.getCodigo()==codigo){
                return listaPassagem;
            }            
        }
        return null;
    }
    
    public Venda buscaPassagemPorCliente(String Rg){
        for (Venda listaPassagem : listaPassagens) {
            if(listaPassagem.getCliente().getRg().equalsIgnoreCase(Rg)){
                return listaPassagem;
            }            
        }
        return null;
    }
}

    

