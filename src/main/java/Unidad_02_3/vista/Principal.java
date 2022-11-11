/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_3.vista;

import Unidad_02_3.modelo.Estudiante;
import Unidad_02_3.modelo.Jugador;
import Unidad_02_3.servicio.EstudianteServicio;
import Unidad_02_3.servicio.JugadorServicio;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {

        var enner = new Jugador("Enner Valencia", 80, 175, LocalDate.of(1998, 2, 01));
        var byron = new Jugador("Byron Castillo", 171, 132, LocalDate.of(1998, 11, 10));
        var dominguez = new Jugador("Dida Dominguez", 196, 176, LocalDate.of(1987, 6, 5));
        var galindez = new Jugador("Hernán Galindez", 189, 165, LocalDate.of(1987, 3, 30));

        var baseDatosJugadores = new JugadorServicio();
        baseDatosJugadores.crear(enner);
        baseDatosJugadores.crear(byron);
        baseDatosJugadores.crear(dominguez);
        baseDatosJugadores.crear(galindez);
        baseDatosJugadores.eliminarPorPosicion(1);

        System.out.println(baseDatosJugadores.listar());
        baseDatosJugadores.eliminarPorPosicion(1);
        System.out.println(baseDatosJugadores.listar());
        
        
        var sebas=new Estudiante("Sebastian Calvo", "0302401534", 165,
                LocalDate.of(2003, Month.JUNE, 4));
        var emi=new Estudiante("Emilio Rodriguez","0304547474");
        var neira=new Estudiante("Wilson Neira","0305478747");
        
        var baseDatosEstudiantes = new EstudianteServicio();
        baseDatosEstudiantes.crear(sebas);
        baseDatosEstudiantes.crear(emi);
        baseDatosEstudiantes.crear(neira);
        
        System.out.println(baseDatosEstudiantes.listar());
        baseDatosEstudiantes.eliminarPorPosicion(2);
        System.out.println(baseDatosEstudiantes.listar());

    }

}
