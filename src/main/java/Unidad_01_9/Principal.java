/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_01_9;

import Unidad01_8.*;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {

        var scaloni = new DirectorTecnico("ARG",3,"Argentina",5);
        var alfaro = new DirectorTecnico("ECU",7,"Ecuatoriana",20);

        alfaro.setNombre("Gustavo Alfaro");
        alfaro.setNacionalidad("Argentina");
        alfaro.setFechaNacimiento(1962);
        alfaro.setYearsTrayectoria(20);
        
        var ecuador = new Seleccion("ECU","Federación Ecuatoriana de Fútbol (FEF)"
                ,"CONMEBOL",4,alfaro);
         System.out.println(ecuador.obtienePais()+" Datos del D.T: "
                +ecuador.getSeleccionador().getNombre());
        
        var argentina = new Seleccion("ARG","Asociación del Fútbol Argentino (AFA)"
                ,"CONMEBOL",17,scaloni);

      
        
        scaloni.setNombre("Lionel Scaloni");
        scaloni.setPais(argentina);
        scaloni.setTitulos(3);
        scaloni.setFechaNacimiento(1978);
        scaloni.setNacionalidad("Argentina");
        scaloni.setYearsTrayectoria(5);

        argentina.codigoFIFA = "ARG";
        argentina.confederacion = "CONMEBOL";
        argentina.nombre = "Asociación del Fútbol Argentino";
        argentina.participacionesMundial = 17;
        argentina.seleccionador=scaloni;

        var enner = new Jugador();
        enner.setNombre("Enner Valencia");
        enner.setPosicion("delantero");
        enner.setFechaNacimiento(1989);
        enner.setEquipo(ecuador);
        System.out.println("Datos del D.T de Enner "+enner.getEquipo().getSeleccionador().getNombre());

        var piero = new Jugador();
        piero.setNombre("Piero Hincapié");
        piero.setPosicion("defensa central");
        piero.fechaNacimiento = 2002;
        piero.equipo = ecuador;

        var platita = new Jugador();
        platita.nombre = "Gustavo Plata";
        platita.posicion = "delantero";
        platita.fechaNacimiento = 2000;
        platita.equipo = ecuador;

        var messi = new Jugador();
        messi.nombre = "Lionel Messi";
        messi.posicion = "delantero";
        messi.fechaNacimiento = 1986;
        messi.equipo = argentina;

        System.out.println(enner.mostrarInfo());
        System.out.println(piero.mostrarInfo());
        System.out.println(platita.mostrarInfo());
        System.out.println(messi.mostrarInfo());
        System.out.println(alfaro.mostrarInfo());
        System.out.println(scaloni.mostrarInfo());
    }

}
