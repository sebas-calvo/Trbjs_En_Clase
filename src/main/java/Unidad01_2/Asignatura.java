/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_2;

/**
 *
 * @author sebas
 */
public class Asignatura {
    
    int codigo;
    String nombre;
    int horas;
    String nombreDocente;
    double costoHora;
    boolean vigente;
    
    String mostrarInformacion(){
        var retorno="La asignatura es: "+this.nombre+" el docente es: "
                +this.nombreDocente+ " la asignatura cuesta: "+this.calcularCosto();
        return retorno;
    }
    
    double calcularCosto(){
        var retorno = this.costoHora*this.horas;
        return retorno;
                
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
