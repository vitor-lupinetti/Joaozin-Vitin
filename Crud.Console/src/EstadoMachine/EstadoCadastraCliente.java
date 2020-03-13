/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

import business.config.Config;
import business.crud.Crud;
import comuns.enums.EntidadesDisponiveis;
import java.util.Scanner;
import comuns.vos.Cliente;
import crud.console.CrudConsole;
/**
 *
 * @author 082170031
 */
public class EstadoCadastraCliente extends EstadoMachine{

    Scanner scan = new Scanner(System.in);
    @Override
    public boolean Executa() {
        Cliente cliente = new Cliente();
        
        System.out.println("Digite o nome do cliente: ");
        cliente.setNome(scan.nextLine().trim());
        System.out.println("Digite o Telefone: ");
        cliente.setTelefone(scan.nextInt());
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Endereço: ");
        cliente.setEndereço(scan.nextLine().trim());
        Crud crud = new Crud();
        crud.Insere(cliente, EntidadesDisponiveis.CLIENTE);
        
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
