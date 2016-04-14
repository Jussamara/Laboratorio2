
package model;


public class Cliente {
    private String rg;
    private String nome;
    private String telefone;

    public Cliente(String rg, String nome, String telefone) {
        this.rg = rg;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rg=" + rg + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
    
    
}
