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
        return this.nombre+" juega en la "+this.equipo.nombre
        +", perteneciente a la "+this.equipo.confederacion
        +", su director tecnico se llama "+this.equipo.director.nombre+", nació en el año "
        +this.fechaNacimiento+" y juega en la posición de "+ this.posicion;
    }
    
}
