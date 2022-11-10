
import java.util.ArrayList;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_2.modelo;
/**
 *
 * @author sebas
 */
public class Carrera{
    private String nombre;
    private int numeroCiclos;
    private ArrayList<estudiante> estudianteList;

    public Carrera(String nombre, int numeroCiclos) {
        this.nombre = nombre;
        this.numeroCiclos = numeroCiclos;
        this.estudianteList=new ArrayList<>();
    }
    
    public void nuevoEstudiante(Estudiante estudiante){
        this.estudianteList.add(estudiante);
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCiclos() {
        return numeroCiclos;
    }

    public void setNumeroCiclos(int numeroCiclos) {
        this.numeroCiclos = numeroCiclos;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", numeroCiclos=" + numeroCiclos + '}';
    }
    
}
