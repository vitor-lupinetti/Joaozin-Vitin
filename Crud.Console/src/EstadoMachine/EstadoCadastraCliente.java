/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

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
        
        System.out.println("Digite o nome do funcionario: ");
        cliente.setNome(scan.nextLine());
        System.out.println("Digite o Telefone: ");
        cliente.setTelefone(scan.nextInt());
        System.out.println("Digite o Endereço: ");
        cliente.setEndereço(scan.nextLine());
        CrudConsole.estadoConsole = EnumEstado.MenuGerente.getEstadoMaquina();
        return false;
    }
    
}
