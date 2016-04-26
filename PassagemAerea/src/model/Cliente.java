package model;

/**
 * Essa classe serve para trabalhar com o objeto Cliente. Trabalha com
 * informações: rg, nome e telefone;.
 *
 * @author mariana01
 */
public class Cliente {

    private String rg;
    private String nome;
    private String telefone;

    /**
     * Inicia o objeto Cliente com seus dados.
     *
     *
     * @param rg String que referencia o atributo rg do Cliente.
     * @param nome String que referencia o atributo nome do Cliente.
     * @param telefone String que referencia o atributo telefone do Cliente.
     */
    public Cliente(String rg, String nome, String telefone) {
        this.rg = rg;
        this.nome = nome;
        this.telefone = telefone;
    }

    /**
     * Retorna o rg do cliente.
     *
     * @return String rg.
     */
    public String getRg() {
        return rg;
    }

    /**
     * Retorna o nome do cliente.
     *
     * @return String nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o telefone do cliente.
     *
     * @return String telefone.
     */
    public String getTelefone() {
        return telefone;
    }
/**
     * Recebe como String todos os dados do cliente.
     *
     * @return String Cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" + "rg=" + rg + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
}
