/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_01_9;


import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class DirectorTecnico extends Persona{

   
    String codigoFIFA;
    private Seleccion pais;
    private int titulos;
    private String nacionalidad;
    private int yearsTrayectoria;

    public String obtenerRecord() {
        var retorno = "No especificado";
        var partidosGanados = 0;
        var partidosPerdidos = 0;
        var partidosEmpatados = 0;
        var lectura = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de partidos ganados del DT de la " + this.pais.nombre+"");
        partidosGanados = lectura.nextInt();

        System.out.println("Ingrese la cantidad de partidos perdidos del DT de la " + this.pais.nombre);
        partidosPerdidos = lectura.nextInt();

        System.out.println("Ingrese la cantidad de partidos empatados del DT de la " + this.pais.nombre);
        partidosEmpatados = lectura.nextInt();

        retorno = partidosGanados + "-" + partidosPerdidos + "-" + partidosEmpatados;
        return retorno;
    }

    public String mostrarInfoDT() {
        return this.getNombre() + " es el Director Tecnico de la seleccion de "
                + this.pais.obtienePais() +", su nacionalidad es "+this.nacionalidad
                +", es del año "+this.getFechaNacimiento()+", a ganado "+this.titulos
                +" titulos, lleva "+this.yearsTrayectoria
                +" años de trayectoria y tiene un record de " 
                + this.obtenerRecord() + " (G-P-E)";
    }
    
    
    
    public void setNacionalidad(String n){
        this.nacionalidad=n;
    }
    
    public void setYearsTrayectoria(int yearsTrayectoria) {
        this.yearsTrayectoria = yearsTrayectoria;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }    
    public void setPais(Seleccion pais) {
        this.pais = pais;
    }

    public DirectorTecnico(String pais, int titulos, String nacionalidad, int yearsTrayectoria) {
   
        this.codigoFIFA = pais;
        this.titulos = titulos;
        this.nacionalidad = nacionalidad;
        this.yearsTrayectoria = yearsTrayectoria;
    }
    
    
    
}