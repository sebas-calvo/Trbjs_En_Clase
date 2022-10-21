/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_7_RELACIONES;

/**
 *
 * @author sebas
 */
public class LugarMatriculacion {

    String descripcion;
    String telefono;
    String provincia;
    String ciudad;

    public String mostrarInfo() {
        return "La descripcion es " + this.descripcion + ", el telefono es: "
                + this.telefono + ", la provincia es: " + this.provincia
                + " y la ciudad es: " + this.ciudad;
    }
    
    

}
