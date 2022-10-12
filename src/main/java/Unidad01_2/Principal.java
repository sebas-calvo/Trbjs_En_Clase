/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_2;

/**
 *
 * @author sebas
 */
public class Principal {
    
    public static void main(String [] args){
        System.out.println("Hola mundo");
        var progra=new Asignatura();
        progra.codigo=1;
        progra.costoHora=3;
        progra.horas=160;
        progra.nombre="Programacion Orientada a Objetos(P.O.O)";
        progra.nombreDocente="Mauricio Ortiz";
        progra.vigente=true;
        
        System.out.println(progra.mostrarInformacion());
    }
    
    
    
    
    
    
    
    
    
    
}
