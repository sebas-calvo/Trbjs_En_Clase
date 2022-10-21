/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_7_RELACIONES;

/**
 *
 * @author sebas
 */
public class Propietario {
    
    String nombre;
    String telefono;
    String direccion;
    int yearNacimiento;
    
    public String mostrarInfo(){
        return "El propietario se llama: "+this.nombre+ " su número de teléfono es:"
                +this.telefono+ "vive en la dirección"+this.direccion+" y tiene "
                +this.yearNacimiento+ "años";
    }
    
    public int calcularEdad(int yearActual){
        return yearActual-this.yearNacimiento;
    }
}
