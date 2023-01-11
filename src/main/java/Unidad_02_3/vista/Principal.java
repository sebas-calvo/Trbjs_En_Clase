/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_3.vista;

import Unidad_02_3.modelo.Estudiante;
import Unidad_02_3.modelo.Jugador;
import Unidad_02_3.servicio.EstudianteServiceImpl;
import Unidad_02_3.servicio.JugadorServiceImpl;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {

        var enner = new Jugador(10, "Enner Valencia", 130,145,
                LocalDate.of(1996, Month.MARCH, 4));
        
        var byron = new Jugador(20,"Byron Castillo", 171, 132,
                LocalDate.of(1998, 11, 10));
        
        var dominguez = new Jugador(30,"Dida Dominguez", 196, 176,
                LocalDate.of(1987, 6, 5));
        
        var galindez = new Jugador(40,"Hernán Galindez", 189, 165,
                LocalDate.of(1987, 3, 30));
        
        var galindezNuevo = new Jugador(41,"Hernán Galindez",80,175,LocalDate.of(1990, 02, 01));

        var baseDatosJugadores = new JugadorServiceImpl();
        baseDatosJugadores.crear(enner);
        baseDatosJugadores.crear(byron);
        baseDatosJugadores.crear(dominguez);
        baseDatosJugadores.crear(galindez);
        baseDatosJugadores.eliminar(10);

        System.out.println(baseDatosJugadores.listar());
        baseDatosJugadores.eliminar(20);
        baseDatosJugadores.eliminar(30);
        System.out.println(baseDatosJugadores.listar());
        baseDatosJugadores.modificar(40, galindezNuevo);
        System.out.println(baseDatosJugadores.listar());
        
        
        
        var sebas=new Estudiante(1,"Sebastian Calvo", "0302401534", 165,
                LocalDate.of(2003, Month.JUNE, 4));
        
        var emi=new Estudiante(2,"Emilio Rodriguez","0304547474",165
                ,LocalDate.of(2003, Month.JUNE, 14));
        
        var neira=new Estudiante(3,"Wilson Neira","0305478747",146
                ,LocalDate.of(2003, Month.JUNE, 14));
        var neiranew=new Estudiante(4,"Wilson Neira","0305478747",160
                ,LocalDate.of(2003, Month.JUNE,21));
        
        var baseDatosEstudiantes = new EstudianteServiceImpl();
        baseDatosEstudiantes.crear(sebas);
        baseDatosEstudiantes.crear(emi);
        baseDatosEstudiantes.crear(neira);
        
        System.out.println(baseDatosEstudiantes.listar());
        baseDatosEstudiantes.eliminar(3);
        System.out.println(baseDatosEstudiantes.listar());
        baseDatosEstudiantes.modificar(3, neiranew);
        System.out.println(baseDatosEstudiantes.listar());
        
        var jugadorControl=new Jugador Control();
        var data=new String[7];
        data[0]="10";
        data[1]="Enner Valencia";
        data[2]="85";
        data[3]="185";
        data[4]="1998";
        data[5]="06";
        data[6]="22";
        
        
     

    }

}
