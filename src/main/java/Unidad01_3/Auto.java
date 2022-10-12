/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_3;

/**
 *
 * @author sebas
 */
public class Auto {

    String marca;
    String placa;
    String nombrePropietario;

    public String mostrarInfo() {
        var retorno = " El auto tiene placa: "+this.placa+" su marca es "
                +this.marca+" y su propietario es: "+this.nombrePropietario;
        
        return retorno;
    }
        
    public String getProvincia() {
        var retorno = "";
        return retorno;
       
    } 
    public String getPaisMarca() {
        var retorno = "";
        if (this.marca.equals("Chevrolet")) 
            retorno = "EE.UU";
            else 
            if (this.marca.equals("Toyota")) 
                retorno = "Japón";
                else 
                if (this.marca.equals("Jetour"))
                    retorno="China";
                    else
                    if (this.marca.equals("Mercedez Benz"))
                    retorno="Alemania";
                        else
                        if (this.marca.equals("Pagani"))
                    retorno="Italia";

        else
        retorno = "No definido";
            
        
    return retorno;
    }
        
    
public int getNumeroContinente() {
        var retorno=0;
        
        return retorno;
        
        
    }

}
