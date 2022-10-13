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
    int year;
    String color;
    double precio;

    public String mostrarInfo() {
        var retorno = " El auto tiene placa: " + this.placa + " su marca es "
                + this.marca + " y su propietario es: " + this.nombrePropietario;

        return retorno;
    }

    public String getProvincia() {
        var retorno = "";
        var primeraLetra = "";
        primeraLetra = this.placa.substring(0, 1);
        switch (primeraLetra) {
            case "A":
                retorno = "Azuay";
                break;
            case "B":
                retorno = "Bolivar";
                break;
            case "U":
                retorno = "Cañar";
                break;
            case "C":
                retorno = "Carchi";
                break;
            case "X":
                retorno = "Cotopaxi";
                break;
            case "H":
                retorno = "Chimborazo";
                break;
            case "O":
                retorno = "EL Oro";
                break;
            default:
                retorno = "Provincia no definida";
        }

        return retorno;

    }

    public String getPaisMarca() {
        var retorno = "";
        if (this.marca.equals("Chevrolet")) {
            retorno = "EE.UU";
        } else if (this.marca.equals("Toyota")) {
            retorno = "Japón";
        } else if (this.marca.equals("Jetour")) {
            retorno = "China";
        } else if (this.marca.equals("Mercedez Benz")) {
            retorno = "Alemania";
        } else if (this.marca.equals("Pagani")) {
            retorno = "Italia";
        } else {
            retorno = "No definido";
        }

        return retorno;
    }
    
    public int getNumeroContinente(){
        var retorno=0;
        var marcaPais=this.getPaisMarca();
        switch(marcaPais){
            case "EE.UU":
                retorno=2;
                break;
            case "Japón":
                retorno=3;
                break;
            default:
                retorno=0;
        }
        return retorno;   
    }
    
    public double calcularIVA(){
        var retorno=0.0d;
        retorno=this.precio*0.12;
      
        
        return retorno;
    }
    
    public int calcularEdad(int yearActual){
        var retorno=0;    
        retorno=yearActual-this.year;
        
        return retorno;
    }
    
    //10% por cada año de uso
    //La depreciacion no puede exceder el precio
    public double calcularDepreciacion(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularEdad(yearActual);
        retorno=edad*0.10*this.precio;
 
        return retorno;
    }
    
    /*
    Edad 0-5: 10% del precio
    Edad 5-10: 8% del precio
    Edad 10-15: 7% del precio
    Edad >15: 6% del precio
    */
    
    public double calcularCostoMatricula(int yearActual){
        var retorno=0.0d;
        var edad=this.calcularEdad(yearActual);
        if(edad>=0 & edad<5)
    
            
    return retorno;
    }
    
      /*
    Edad 0-5 y precio de 10000 SI
    Edad 10-15 y precio de 10000 a 20000 SI
    Edad >15 y precio de 20000 a 30000 SI
    Edad >15 NO
     */
    public boolean sePuedeAsegurar(int yearActual){
        var retorno=false;
        var edad=this.calcularEdad(yearActual);
        if(edad<=5 & this.precio<10000)
        {
            retorno=true;
        }else{
        if(edad<=5 & this.precio>=10000 & this.precio<20000)
        {
            retorno=true;
        }else{
        if(edad>=10 & edad<=15 & this.precio>=20000 & this.precio<30000)
        {
            retorno=true;
        }else{
        if(edad>15)
        {
            retorno=false;
        }else{
        }
        }    
        }
        return retorno;
        }
        return false;  
}
}
