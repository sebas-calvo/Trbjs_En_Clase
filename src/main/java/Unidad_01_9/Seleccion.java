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
public class Seleccion{

    String codigoFIFA;
    String nombre;
    String confederacion;
    int participacionesMundial;
    DirectorTecnico seleccionador;
    
    public Seleccion(String cF, String n,String conf, int nP, DirectorTecnico dt){
        this.codigoFIFA=cF;
        this.nombre=n;
        this.confederacion=conf;
        this.participacionesMundial=nP;
        this.seleccionador=dt;
    }

    public String obtienePais() {
        var retorno = "desconocido";

        switch (codigoFIFA) {
            case "ECU":
                retorno="Ecuador";
                break;
            case "ARG":
                retorno="Argentina";
                break;
            case "BRA":
                retorno="Brasil";
                break;
            default:
                throw new AssertionError();
        }
        return retorno;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setCodigoFIFA(String codigoFIFA) {
        this.codigoFIFA = codigoFIFA;
    }

    public String getCodigoFIFA() {
        return codigoFIFA;
    }

    public void setParticipacionesMundial(int participacionesMundial) {
        this.participacionesMundial = participacionesMundial;
    }
    
    public int getParticipacionesMundial() {
        return participacionesMundial;
    }

    public void setSeleccionador(DirectorTecnico seleccionador) {
        this.seleccionador = seleccionador;
    }
    
    public DirectorTecnico getSeleccionador() {
        return seleccionador;
    }

    
    
    
    
    
}
