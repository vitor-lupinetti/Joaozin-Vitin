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
 * @author joao-
 */
public class EstadoMenu extends EstadoMachine{
    @Override
    public boolean Executa() {
        try
            {
            System.out.println(" Menu Principal");
            Scanner scan = new Scanner(System.in);
            System.out.println("0 - Sair");
            System.out.println("1 - Login");
            int opcao = scan.nextInt();
            switch (opcao)
            {
                case 0:
                    CrudConsole.estadoConsole = EnumEstado.Inicio.getEstadoMaquina();
                    break;
                case 1:
                    CrudConsole.estadoConsole = EnumEstado.Login.getEstadoMaquina();
                    break;
            }
        }
        catch(Exception e){
            System.out.println("\n\n *****!ENTRADA DE DADOS INVALIDA!*****\n\n");
            CrudConsole.estadoConsole = EnumEstado.Inicio.getEstadoMaquina();;
        } 
        return false;
    }
}
