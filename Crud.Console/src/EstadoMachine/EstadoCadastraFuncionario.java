/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;
import comuns.vos.Funcionario;
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
        
        System.out.println("Digite 0 para gerente ou 1 para vendedor: ");
        String acesso = scan.nextLine();
        func.setAcesso(acesso);
    }
    
}
