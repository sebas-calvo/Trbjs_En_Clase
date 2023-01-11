/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_2.vista;

import Unidad_02_2.modelo.Carrera;
import Unidad_02_2.modelo.Estudiante;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {
        /*var juana = new Dueño("0104048794", "Juana Moreno Dávila");
        juana.nuevoTelefono("0984357604", 0, "Móvil personal", "Bellsouth");
        juana.nuevoTelefono("072818314", 0, "Casa", "Etapa");
        juana.nuevoTelefono("0984357604", 0, "Móvil de mi esposo", "Movistar");

        System.out.println("juana = " + juana.toString());*/

        var pedro=new Estudiante("Pedro Gonzales","0305475858");
        var luis=new Estudiante("Luis Perez","0145478747");
        
        var teleco = new Carrera("Ing. en Telecomunicacion", 8);
        teleco.nuevoEstudiante(pedro);
        teleco.nuevoEstudiante(luis);
        
        var elec = new Carrera("Ing. Electrica", 8);
        teleco.nuevoEstudiante(pedro);
        teleco.nuevoEstudiante(luis);
        
        var com = new Carrera("Ing. en Computacion", 8);
        teleco.nuevoEstudiante(pedro);
        teleco.nuevoEstudiante(luis);
        
        
        System.out.println("telecomunicaciones ="+teleco.toString());
        System.out.println("electrica ="+elec.toString());
        System.out.println("computacion ="+com.toString());
    }
}
