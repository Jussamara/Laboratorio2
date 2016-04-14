
package Repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Avioes;


public class RepositorioAviao {
      private List<Avioes> listaavioes;
  
    
    public RepositorioAviao(){
       listaavioes = new ArrayList<Avioes>();
      
    } 
    public boolean addAvioes(Avioes avi) {
        return (listaavioes.add(avi));
    }
     
    public List<Avioes> getListaAvioes() {
        return listaavioes;
    }
    public boolean aviaoExiste(int codigo) {
        for (Avioes aviao : listaavioes) {
            if (aviao.getCodigo()==(codigo)) {
                return true;
            }
        }
        return false;
    }

    public Avioes buscarAviao(int codigo) {
        for (Avioes aviao : listaavioes) {
            if (aviao.getCodigo()==(codigo)) {
                return aviao;
           }
        }
        return null;
    }
    
}
