/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_3.modelo;

import java.time.LocalDate;

/**
 *
 * @author sebas
 */
public class Jugador {
    private int codigo;
    private String nombre;
    private  int estatura;
    private  double peso;
    private LocalDate fechaNacimiento;

    public Jugador(int codigo, String nombre, int estatura, double peso, LocalDate fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
    }
    

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    public int calcularEdad(){
        var yearActual=LocalDate.now().getYear();
        return yearActual-this.fechaNacimiento.getYear();
    }

    @Override
    public String toString() {
        return "Jugador{" + "codigo=" + codigo + ", nombre=" + nombre 
                + ", estatura=" + estatura + ", peso=" + peso + ", fechaNacimiento=" 
                + fechaNacimiento + '}'+ " tiene: "+this.calcularEdad()+" años";
    }

    
    
    
}
