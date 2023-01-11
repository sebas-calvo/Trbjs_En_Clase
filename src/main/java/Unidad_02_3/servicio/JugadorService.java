/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Unidad_02_3.servicio;

import Unidad_02_3.modelo.Jugador;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface JugadorService {
    
    public abstract void crear(Jugador jugador);
    public abstract void modificar(int codigo,Jugador jugadorModificado);
    public abstract void eliminar(int codigo);
    public abstract List<Jugador> listar();
    
}
