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
        System.out.println(" Menu Principal");
        Scanner scan = new Scanner(System.in);
        System.out.println("0 - Sair");
        int opcao = scan.nextInt();
        switch (opcao)
        {
            case 0:
                CrudConsole.estadoConsole = EnumEstado.Inicio.getEstadoMaquina();
                break;
            case 1:
                
                break;
        }
        return false;
    }
}