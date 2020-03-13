/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

import crud.console.CrudConsole;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EstadoListaCliente extends EstadoMachine{

    Scanner scan = new Scanner(System.in);
    @Override
    public boolean Executa() {
        
        
        try{           
            
            
            
            System.out.println("0 - Voltar ao menu\n1 - Cadastrar\n2 - Alterar\n3 - Excluir");        
            int opcao = scan.nextInt();
            switch (opcao)
            {
                case 0:
                    CrudConsole.AcessoProxMenu();
                    break;            
                case 1:
                    CrudConsole.estadoConsole = EnumEstado.CadastraCliente.getEstadoMaquina();
                    break;
                case 2:
                    CrudConsole.AcessoProxMenu();
                    break;
                case 3:
                    CrudConsole.AcessoProxMenu();
                    break;
            }            
        }
        catch(Exception e){
            System.out.println("\n\n *****!ENTRADA DE DADOS INVALIDA!*****\n\n");
            CrudConsole.AcessoProxMenu();
        } 
       return false;
    }
    
}
