/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_8;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class DirectorTecnico {

    String nombre;
    Seleccion pais;
    int titulos;

    public String obtenerRecord() {
        var retorno = "No especificado";
        var partidosGanados = 0;
        var partidosPerdidos = 0;
        var partidosEmpatados = 0;
        var lectura = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de partidos ganados del DT de la " + this.pais.nombre);
        partidosGanados = lectura.nextInt();

        System.out.println("Ingrese la cantidad de partidos perdidos del DT de la " + this.pais.nombre);
        partidosPerdidos = lectura.nextInt();

        System.out.println("Ingrese la cantidad de partidos empatados del DT de la " + this.pais.nombre);
        partidosEmpatados = lectura.nextInt();

        retorno = partidosGanados + "-" + partidosPerdidos + "-" + partidosEmpatados;
        return retorno;
    }

    public String mostrarInfo() {
        return this.nombre + " es el Director Tecnico de la seleccion de "
                + this.pais.obtienePais() + ", a ganado " + this.titulos
                + " titulos, y tiene un record de " + this.obtenerRecord() + " (G-P-E)";
    }

}
