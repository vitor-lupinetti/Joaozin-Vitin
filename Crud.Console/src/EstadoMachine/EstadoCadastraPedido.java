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
        
        System.out.println("Digite o nome do cliente: ");
        pedido.setClienteNome(scan.nextLine());
        System.out.println("Digite o Nome do prodito: ");
        pedido.setProduto(scan.nextLine());
        System.out.println("Digite 0 para vendedor ou 1 para gerente: ");
        pedido.setVendedor(scan.nextLine());
        
        
        CrudConsole.estadoConsole = EnumEstado.MenuGerente.getEstadoMaquina();
        return false;
    }
}
