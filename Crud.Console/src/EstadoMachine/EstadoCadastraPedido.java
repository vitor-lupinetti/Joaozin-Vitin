/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

import business.config.Config;
import business.crud.Crud;
import comuns.enums.EntidadesDisponiveis;
import comuns.vos.Pedido;
import crud.console.CrudConsole;
import java.util.Scanner;
/**
 *
 * @author 082170017
 */
public class EstadoCadastraPedido extends EstadoMachine{

    Scanner scan = new Scanner(System.in);
    @Override
    public boolean Executa() {
        Pedido pedido = new Pedido();
        System.out.println("Digite o nome do cliente da venda: ");
        pedido.setClienteNome(scan.nextLine().trim());
        System.out.println("Digite a quantidade de produtos da venda: ");
        pedido.setQtdProdutos(scan.nextInt());
        String[] produtos = new String[pedido.getQtdProdutos()];
        
        for (int i = 0; i < pedido.getQtdProdutos(); i++) {
            System.out.println("Digite o Nome do produto" + i + ":");
            scan = new Scanner(System.in);
            produtos[i] = scan.nextLine().trim();
        }
        pedido.setProdutos(produtos);
        System.out.println("Digite 0 para vendedor ou 1 para gerente: ");
        pedido.setVendedor(scan.nextLine());
        
        Crud crud = new Crud();        
        crud.Insere(pedido, EntidadesDisponiveis.PEDIDO);
        
        if (Config.getInstance().getAcessoFuncionario().equals("1")){
            CrudConsole.estadoConsole = EnumEstado.MenuGerente.getEstadoMaquina();
        }
        else
        {
            CrudConsole.estadoConsole = EnumEstado.MenuVendedor.getEstadoMaquina();
        }
        return false;
    }
}
