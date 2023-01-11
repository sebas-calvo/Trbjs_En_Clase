/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_1.modelo;

import Unidad_02_1.*;

/**
 *
 * @author sebas
 */
public class Receta {
    private String medicamento;
    private int cantidad;
    private String indicacion;

    public Receta(String medicamento, int cantidad, String indicacion) {
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.indicacion = indicacion;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIndicacion() {
        return indicacion;
    }

    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
    }

    @Override
    public String toString() {
        return "Receta{" + "medicamento=" + medicamento + ", cantidad=" + cantidad 
                + ", indicacion=" + indicacion + '}';
    }
    
}
