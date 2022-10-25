/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_8;

/**
 *
 * @author sebas
 */
public class Jugador {
    String nombre;
    int fechaNacimiento;
    String posicion;
    Seleccion equipo;
    
    public String mostrarInfo(){
        return this.nombre+" juega en la selección de "+this.equipo.nombre;
    }
    
}
