/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_01_9;

/**
 *
 * @author sebas
 */
public class Jugador extends Persona{
    
    private String posicion;
    private Seleccion equipo;

    public Jugador(String nombre, int fN, String posicion, Seleccion equipo) {
        this.posicion = posicion;
        this.equipo = equipo;
    }
    
    public String mostrarInfoJugador(){
        return this.mostrarInfo()+" juega en la posición de: "+this.posicion
                +" pertenece al esquipo de: "+this.equipo.getNombre();
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Seleccion getEquipo() {
        return equipo;
    }

    public void setEquipo(Seleccion equipo) {
        this.equipo = equipo;
    }
    
    
    
    
    
}
