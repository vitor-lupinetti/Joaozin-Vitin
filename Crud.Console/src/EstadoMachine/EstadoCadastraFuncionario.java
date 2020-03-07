/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;
import comuns.vos.Funcionario;
import crud.console.CrudConsole;
import java.util.Scanner;
/**
 *
 * @author 082170017
 */
public class EstadoCadastraFuncionario extends EstadoMachine{

    Scanner scan = new Scanner(System.in);
    @Override
    public boolean Executa() {
        Funcionario func = new Funcionario();
        
        System.out.println("Digite o nome do funcionario: ");
        func.setNome(scan.nextLine());
        System.out.println("Digite o username: ");
        func.setUsername(scan.nextLine());
        System.out.println("Digite a senha: ");
        func.setSenha(scan.nextLine());
        System.out.println("Digite 0 para gerente ou 1 para vendedor: ");
        String acesso = scan.nextLine();
        if(acesso.equals("0"))
        {
            func.setAcesso(true);
        }
        else
            func.setAcesso(false);
        
        CrudConsole.estadoConsole = EnumEstado.MenuGerente.getEstadoMaquina();
        return false;
        
    }
    
}
