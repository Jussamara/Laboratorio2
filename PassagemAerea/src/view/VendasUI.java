
package view;


import view.menu.VendaMenu;
import Repositorio.RepositorioVenda;
import Repositorio.RepositorioVoo;
import Repositorio.RepositorioCliente;
import model.Cliente;
import model.Voo;
import model.Venda;
import util.Console;
import java.util.Date;



public class VendasUI {

    RepositorioVenda vendas;
    RepositorioCliente clientes;
    RepositorioVoo voos;

    VendasUI(RepositorioCliente Clientes, RepositorioVenda listaPassagens, RepositorioVoo voo) {
        this.clientes=Clientes;
        this.vendas=listaPassagens;
        this.voos=voo;
    }

    public void executar() {
        int opcao = 0;
        do {
            VendaMenu.mostrarMenu();
            opcao = Console.scanInt("Digite aqui sua opção: ");
            switch (opcao) {
                case VendaMenu.OP_CADASTRAR:
                    cadastrar();
                    break;
                case VendaMenu.OP_LISTAR:
                    listarPassagensVendidas();
                    break;
                case VendaMenu.OP_VOLTAR:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida...");
            }
        } while (opcao != VendaMenu.OP_VOLTAR);
    }


    public void cadastrar() {
        String idCliente = Console.scanString("Digite o RG do passageiro: ");
        Cliente comprador = null;
       if (clientes.clienteExiste(idCliente)) {
            comprador = clientes.buscarCliente(idCliente);
        } else {
            System.out.println("Cliente não encotrado...");
       }       
        new VooUI(voos).listarVoos();  
        Voo vooSelecionado; 
        int idVoo = Console.scanInt("Digite o código do voo: ");
        if (voos.vooExiste(idVoo)) {
            vooSelecionado = voos.buscarVoo(idVoo);
            Date atual = new Date();//colocar assentos
           int posto = Console.scanInt("Digite Lugar aviao: ");
            if(vooSelecionado.assentoDisponivel(posto)){
                System.out.print("Compra realizada");
            }else{
                System.out.print("Nao a lugar disponivel probure outro Voo !!!");
            }    
            vendas.addVendaPassagem(new Venda(comprador, vooSelecionado, atual,posto  ));
            System.out.println("Venda cadastrada com sucesso...");            
        } else {
            System.out.println("Voo não encontrado!!!");
        }
    }
    public void listarPassagensVendidas(){
        for (Venda v : vendas.getListaPassagens()){
            System.out.println("------------------");
            System.out.println(v);
            System.out.println("------------------");
        }
        
    }
}
