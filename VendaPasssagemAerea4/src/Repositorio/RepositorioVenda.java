package Repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Venda;

/**
 * Essa classe contém os repositórios para Venda.
 *
 * @author mariana01
 */
public class RepositorioVenda {

    private List<Venda> listaPassagens;

    /**
     * Inicia o repositório Venda com seus dados. listaPassagens e recebe
     * ArrayList
     */
    public RepositorioVenda() {
        listaPassagens = new ArrayList<>();
    }

    /**
     * Esse método adiciona Venda de Passagens na lista de Passagens.
     *
     * @author mariana01
     */
    public boolean addVendaPassagem(Venda passagem) {
        return (listaPassagens.add(passagem));
    }

    /**
     * Esse método mostra lista de Venda de passagens.
     *
     * @author mariana01
     */
    public List<Venda> getListaPassagens() {
        return listaPassagens;
    }

    /**
     * Esse método verifica se existe um codigo especifico na lista de
     * Passagens.
     *
     * @author mariana01
     */
    public boolean passagemExiste(int codigo) {
        for (Venda listaPassagem : listaPassagens) {
            if (listaPassagem.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    /**
     * Esse método busca um código na lista de Venda e retorna a lista de
     * passagens.
     *
     * @@author mariana01
     */
    public Venda buscaPassagem(int codigo) {
        for (Venda listaPassagem : listaPassagens) {
            if (listaPassagem.getCodigo() == codigo) {
                return listaPassagem;
            }
        }
        return null;
    }

    /**
     * Esse método busca um rg na lista de Venda e retorna a lista de passagens
     * com cliente e rg.
     *
     * @@author mariana01
     */
    public Venda buscaPassagemPorCliente(String Rg) {
        for (Venda listaPassagem : listaPassagens) {
            if (listaPassagem.getCliente().getRg().equalsIgnoreCase(Rg)) {
                return listaPassagem;
            }
        }
        return null;
    }
}
