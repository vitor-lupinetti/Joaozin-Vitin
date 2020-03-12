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
public class EstadoInicio extends EstadoMachine{
    @Override
    public boolean Executa() {
        boolean sair = false;
        System.out.println("Sistema de vendas de produtos\nEscolha uma opção abaixo:");
        System.out.println("\n1: Login\n2: Sair");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        switch (opcao)
        {
            case 1:
                CrudConsole.estadoConsole = EnumEstado.Login.getEstadoMaquina();
                break;
            case 2:
                sair = true;
                break;
        }
        return sair;
    }
}
