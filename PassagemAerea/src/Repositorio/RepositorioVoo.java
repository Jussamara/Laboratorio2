package Repositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import model.Voo;

/**
 * Essa classe contém os repositórios para Voo.
 *
 * @author mariana01
 */
public class RepositorioVoo {

    private List<Voo> listaVoos;

    /**
     * Esse método mostra lista de Voos.
     *
     * @author mariana01
     */
    public List<Voo> getListaVoos() {
        return listaVoos;
    }

    public void setListaVoos(List<Voo> listaVoos) {
        this.listaVoos = listaVoos;
    }

    /**
     * Inicia o repositório Voo com seus dados. listaVoos e recebe ArrayList
     */
    public RepositorioVoo() {
        listaVoos = new ArrayList<Voo>();

    }

    /**
     * Esse método adiciona horario no Voo na lista de Voo.
     *
     * @author mariana01
     */
    public boolean addHorario(Voo horario) {
        if (verExiste(horario.getHorario())) {
            return false;
        }
        return (listaVoos.add(horario));
    }

    /**
     * Esse método mostra lista de Voos por Horário.
     *
     * @author mariana01
     */
    public List<Voo> getListaHorarios() {
        Collections.sort(listaVoos);
        return listaVoos;
    }

    /**
     * Esse método verifica se existe uma Data e Horário especifico na lista de
     * Voo.
     *
     * @author mariana01
     */
    public boolean verExiste(Date horario) {
        if (!listaVoos.isEmpty()) {
            for (Voo hora : listaVoos) {
                if (hora.getHorario().equals(horario)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Esse método busca um código na lista de Voo e retorna voo.
     *
     * @@author mariana01
     */
    public Voo buscarVoo(int codigo) {
        for (Voo voo : listaVoos) {
            if (voo.getCodigo() == codigo) {
                return voo;
            }
        }
        return null;
    }

    /**
     * Esse método verifica se existe um código especifico na lista de Voo.
     *
     * @author mariana01
     */
    public boolean vooExiste(int codigo) {
        for (Voo voo : listaVoos) {
            if (voo.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    /**
     * Esse método busca uma data e horário na lista de Voo e retorna a hora.
     *
     * @@author mariana01
     */
    public Voo buscarHorarioVoo(Date horario) {
        for (Voo hora : listaVoos) {
            if (hora.getHorario().equals(horario)) {
                return hora;
            }
        }
        return null;
    }
}
