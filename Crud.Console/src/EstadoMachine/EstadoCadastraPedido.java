/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

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
        pedido.setClienteNome(scan.nextLine());
        System.out.println("Digite a quantidade de produtos da venda: ");
        pedido.setQtdProdutos(scan.nextInt());
        String[] produtos = new String[pedido.getQtdProdutos()];
        
        for (int i = 0; i < pedido.getQtdProdutos(); i++) {
            System.out.println("Digite o Nome do produto" + i + ":");
            produtos[i] = scan.nextLine();
        }
        pedido.setProdutos(produtos);
        System.out.println("Digite 0 para vendedor ou 1 para gerente: ");
        pedido.setVendedor(scan.nextLine());
        
        if("1".equals(pedido.getVendedor()))
            CrudConsole.estadoConsole = EnumEstado.MenuGerente.getEstadoMaquina();
        else
            CrudConsole.estadoConsole = EnumEstado.MenuVendedor.getEstadoMaquina();
        return false;
    }
}
