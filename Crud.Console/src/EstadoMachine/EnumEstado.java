/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

/**
 *
 * @author joao-
 */
public enum EnumEstado {
    Inicio (new EstadoInicio()),
    Login (new EstadoLogin()),
    Menu (new EstadoMenu());
    
    private final EstadoMachine estadoMaquina;
    
    EnumEstado(EstadoMachine estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }
 
    public EstadoMachine getEstadoMaquina() {
        return estadoMaquina;
    }
    
}

