/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_1.modelo;

import Unidad_02_1.*;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Dueño {

    private String cedula;
    private String nombre;
    private ArrayList<Telefono> telefonoList;

    public Dueño(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    
    public void nuevoTelefono(String n){
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Telefono> getTelefonoList() {
        return telefonoList;
    }

    public void setTelefonoList(ArrayList<Telefono> telefonoList) {
        this.telefonoList = telefonoList;
    }

    @Override
    public String toString() {
        return "Due\u00f1o1{" + "cedula=" + cedula + ", nombre=" + nombre 
                + ", telefonoList=" + telefonoList + '}';
    }
    
    
    

}
