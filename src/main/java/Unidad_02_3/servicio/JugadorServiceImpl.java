/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_3.servicio;

import Unidad_02_3.modelo.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class JugadorServiceImpl implements JugadorService{

    private List<Jugador> jugadorList;

    public JugadorServiceImpl() {
        this.jugadorList = new ArrayList();
    }

    public void crear(Jugador jugador) {
        this.jugadorList.add(jugador);
    }
    
    public void modificar(int codigo, Jugador jugadorModificado){
        var indice=0;
                
         this.jugadorList.set(indice, jugadorModificado);
    }
    
    public void eliminar(int codigo) {
        var indice=0;
        for(var jugador:this.jugadorList){
            if(jugador.getCodigo()==codigo){
                this.jugadorList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    public List<Jugador> listar() {
        return this.jugadorList;
    }


}
