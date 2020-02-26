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
public class EstadoLogin extends EstadoMachine{
    
    @Override
    public boolean Executa() {
        boolean sair = false;
        //Usuario user = new Usuario();    import br.com.comuns.crud.ec6.vos.acesso.Usuario;
        Scanner scan = new Scanner(System.in);
        System.out.println("**** LOGIN ****");
        System.out.println("Digite seu usuário:");
        user.setLogin(scan.nextLine());
        System.out.println("Digite sua senha:");
        user.setSenha(scan.nextLine());
        // TODO - Validação de senha
        // Acesso acesso = new Acesso(); import br.com.business.ec6.crud.acesso.Acesso;
        boolean senhaValida = acesso.validaUsuario(user);
        if (senhaValida)
            CrudConsole.estadoConsole = EnumEstado.Inicio.getEstadoMaquina();
        else {
            System.out.println("Dados inválidos!");
        }            
        return sair;
    }
}
