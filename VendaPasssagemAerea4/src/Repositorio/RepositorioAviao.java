package Repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Avioes;

/**
 * Essa classe contém os repositórios para Avião.
 *
 * @author mariana01
 */
public class RepositorioAviao {

    private List<Avioes> listaavioes;

    /**
     * Inicia o repositório Aviao com seus dados. listaAviao e recebe ArrayList
     */
    public RepositorioAviao() {
        listaavioes = new ArrayList<Avioes>();

    }

    /**
     * Esse método adiciona Avião na lista de Aviões.
     *
     * @author mariana01
     */
    public boolean addAvioes(Avioes avi) {
        return (listaavioes.add(avi));
    }

    /**
     * Esse método mostra lista de Aviões.
     *
     * @author mariana01
     */
    public List<Avioes> getListaAvioes() {
        return listaavioes;
    }

    /**
     * Esse método verifica se existe um código especifico na lista de Aviões.
     *
     * @author mariana01
     */
    public boolean aviaoExiste(int codigo) {
        for (Avioes aviao : listaavioes) {
            if (aviao.getCodigo() == (codigo)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Esse método busca um código na lista de Aviões e retorna um Avião.
     *
     * @@author mariana01
     */
    public Avioes buscarAviao(int codigo) {
        for (Avioes aviao : listaavioes) {
            if (aviao.getCodigo() == (codigo)) {
                return aviao;
            }
        }
        return null;
    }
}
