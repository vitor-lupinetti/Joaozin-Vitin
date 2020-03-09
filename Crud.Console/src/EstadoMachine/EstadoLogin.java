/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

import crud.console.CrudConsole;
import java.util.Scanner;
import business.acesso.Acesso;
import comuns.vos.Funcionario;
 /*
 * @author joao-
 */
public class EstadoLogin extends EstadoMachine{
    
    @Override
    public boolean Executa() {
        boolean sair = false;
        Funcionario funcionario;
        Scanner scan = new Scanner(System.in);
        System.out.println("**** LOGIN ****");
        System.out.println("Digite seu usuário:");
        String login = scan.nextLine();
        System.out.println("Digite sua senha:");
        String senha = scan.nextLine();
        // TODO - Validação de senha
        Acesso acesso = new Acesso(); 
        funcionario = acesso.validaFuncionario(login, senha);
        if(funcionario != null){
            if (funcionario.getAcesso().equals("1"))
                CrudConsole.estadoConsole = EnumEstado.MenuGerente.getEstadoMaquina();
            else
            {
                CrudConsole.estadoConsole = EnumEstado.MenuVendedor.getEstadoMaquina();
            }
        }
        else {
                System.out.println("Dados inválidos!");
            }        
        return sair;
    }
}
