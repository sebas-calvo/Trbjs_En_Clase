/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_8;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {

        var alfaro = new DirectorTecnico();
        var scaloni = new DirectorTecnico();

        var ecuador = new Seleccion();
        var argentina = new Seleccion();

        alfaro.nombre = "Gustavo Alfaro";
        alfaro.pais = ecuador;
        alfaro.titulos = 8;

        scaloni.nombre = "Lionel Scaloni";
        scaloni.pais = argentina;
        scaloni.titulos = 3;

        ecuador.codigoFIFA = "ECU";
        ecuador.confederacion = "CONMEBOL";
        ecuador.nombre = "Federacion Ecuatoriana de Futbol";
        ecuador.participacionesMundial = 4;
        ecuador.director = alfaro;

        argentina.codigoFIFA = "AFA";
        argentina.confederacion = "CONMEBOL";
        argentina.nombre = "Asociación del Fútbol Argentino";
        argentina.participacionesMundial = 17;
        argentina.director=scaloni;

        var enner = new Jugador();
        enner.nombre = "Enner Valencia";
        enner.posicion = "delantero";
        enner.fechaNacimiento = 1989;
        enner.equipo = ecuador;

        var piero = new Jugador();
        piero.nombre = "Piero Hincapié";
        piero.posicion = "defensa central";
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
