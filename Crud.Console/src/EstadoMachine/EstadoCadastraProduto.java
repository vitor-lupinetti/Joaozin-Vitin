/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

import comuns.vos.Produto;
import crud.console.CrudConsole;
import java.util.Scanner;
import business.crud.Crud;
import comuns.enums.EntidadesDisponiveis;
/**
 *
 * @author Administrador
 */
public class EstadoCadastraProduto extends EstadoMachine{
    Scanner scan = new Scanner(System.in);
    @Override
    public boolean Executa() {
        Produto produto = new Produto();
        
        System.out.println("Digite o nome do produto: ");
        produto.setDescricao(scan.nextLine());
        System.out.println("Digite a categoria: ");
        produto.setCategoria(scan.nextLine());
        System.out.println("Digite o valor: ");
        produto.setValor(Double.parseDouble(scan.nextLine()));
        
        Crud crud = new Crud();
        crud.Insere(produto, EntidadesDisponiveis.PRODUTO);
        CrudConsole.estadoConsole = EnumEstado.MenuGerente.getEstadoMaquina();
        return false;
    }
}
