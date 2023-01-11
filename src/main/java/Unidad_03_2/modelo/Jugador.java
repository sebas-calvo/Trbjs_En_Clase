/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_03_2.modelo;

import java.time.LocalDate;

/**
 *
 * @author sebas
 */
public class Jugador {
    
    private int codigo;
    private String nombre;
    private double peso;
    private int estatura;
    private LocalDate fechaNacimiento;

    public Jugador(int codigo, String nombre, double peso, int estatura, LocalDate fechaNacimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Jugador{" + "codigo=" + codigo + ", nombre=" + nombre 
                + ", peso=" + peso + ", estatura=" + estatura 
                + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
}
