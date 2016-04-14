
package Repositorio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import model.Cliente;
import model.Voo;

public class RepositorioVoo {

    private List<Voo> listaVoos;
 

    public List<Voo> getListaVoos() {
        return listaVoos;
    }

    public void setListaVoos(List<Voo> listaVoos) {
        this.listaVoos = listaVoos;
    }


    public RepositorioVoo() {
        listaVoos = new ArrayList<Voo>();
        
    }
/*
    public ArrayList<Voo> buscarvooCapacidade(int Capacidade){
       ArrayList<Voo> VooComEssaCapacidade = new ArrayList<Voo>();
       for(Voo V : getListaVoos()){
           if(V.getQtdDisponivel()>=Capacidade){
              VooComEssaCapacidade.add(V);
           }
       }
       return VooComEssaCapacidade;
   }
   
*/
    public boolean addHorario(Voo horario) {
        if(verExiste(horario.getHorario()))
            return false;
        return (listaVoos.add(horario));
    }     

    public List<Voo> getListaHorarios() {
        Collections.sort(listaVoos);
        return listaVoos;
    }

    public boolean verExiste(Date horario) {
        if(!listaVoos.isEmpty()){
        for (Voo hora : listaVoos) {
                if (hora.getHorario().equals(horario)) {
                    return true;
                }
            }
        }
        return false;
    }
     public Voo buscarVoo(int codigo){
        for(Voo voo : listaVoos){
            if(voo.getCodigo() == codigo){
                return voo;
            }
        }
        return null;
    }
       public boolean vooExiste(int codigo){
        for(Voo voo : listaVoos){
            if(voo.getCodigo() == codigo){
                return true;
            }
        }
        return false;
    }
   

    public Voo buscarHorarioVoo(Date horario) {
        for (Voo hora : listaVoos) {
            if (hora.getHorario().equals(horario)) {
                return hora;
            }
        }
        return null;
    }

   
}

  
 

