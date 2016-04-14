
package view;

import Repositorio.RepositorioAviao;
import java.util.Date;
import model.Avioes;
import model.Voo;
import util.Console;
import util.DateUtil;
import view.menu.VooMenu;
import Repositorio.RepositorioVoo;
import java.text.ParseException;

public class VooUI {
    // lista = voo / objeto = horariovoo
    private RepositorioVoo voo;
    private RepositorioAviao listaAvioes;

    public VooUI(RepositorioAviao listaAvioes, RepositorioVoo voo) {
        this.listaAvioes = listaAvioes;
        this.voo = voo;
     
    }

   public VooUI(RepositorioVoo voos) {
       this.voo = voos;
        }

    public void executar() {
        int opcao = 0;
        do {
            System.out.println(VooMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção:");
            switch (opcao) {
                case VooMenu.OP_CADASTRAR:
                    cadastrarVoo();
                    break;
                case VooMenu.OP_LISTAR:
                    listarVoos();
                    break;                   
                case VooMenu.OP_VOLTAR:
                    System.out.println("Retornando ao menu principal..");
                    break;
                default:
                    System.out.println("Opção inválida..");

            }
        } while (opcao != VooMenu.OP_VOLTAR);
    }

    private void cadastrarVoo() {
        //Relaciona os Voos:
        System.out.println("Relacione os Voos abaixo para a Cadastro: ");
        //Mostra todos os avioes existentes no repositório de avioes
        new AviaoUI(listaAvioes).mostrarAvioes();
        int codigo = Console.scanInt("Escolha o Codigo do Aviao: ");
        
        if(listaAvioes.aviaoExiste(codigo)){
            Avioes aviao = listaAvioes.buscarAviao(codigo);//instanciar aviao para o voo
            String dataHora = Console.scanString("Data/Hora (dd/mm/aaaa hh:mm):");
            String origem = Console.scanString("Origem: ");
            String destino = Console.scanString("Destino: ");
            Date horario;
            try {
                horario = DateUtil.stringToDateHour(dataHora);
                if(voo.verExiste(horario)){ 
                    System.out.println("Nesse horario já existe um aviao");
                } else {
                    voo.addHorario(new Voo(horario, aviao, origem, destino));
                    System.out.println("Voo reservado com sucesso!");
                }
               
            } catch (ParseException ex) {
                System.out.println("Data ou hora no formato inválido!");
            }
        }
        else
            System.out.println("Aviao não encontrado!");
    }

    public void listarVoos() {
        System.out.println("Lista de Voos:");
        System.out.println("===================");
     
      for(Voo horario: voo.getListaHorarios()){
            System.out.println(DateUtil.dateHourToString(horario.getHorario())
                     +" Voo codigo => "+horario.getAvioes().getCodigo()+"\n Voo de: "
                    +horario.getOrigem()+"/"+horario.getDestino()+" /"+horario.getAvioes());
            System.out.println("===================");
        }
      
    }
    

} 
