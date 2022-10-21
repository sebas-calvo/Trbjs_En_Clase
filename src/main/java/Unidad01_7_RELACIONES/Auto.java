/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_7_RELACIONES;

/**
 *
 * @author sebas
 */
public class Auto {
    String placa;
    String marca;
    int year;
    String color;
    double precio;
    int cilindraje;
    Propietario owner;
    LugarMatriculacion lugar;
    
    
    public String mostrarInfo() {
        return " El auto tiene placa: " + this.placa + " es de marca: "
                + this.marca + ". El propietario es: " + this.owner.nombre
                + " la dirección del propietario es: " + this.owner.direccion
                + " . El auto cuesta "+this.precio+ " USD, Fue matriculado en "
                +this.lugar.descripcion+", Fue matriculado en la provincia:  "
                +this.lugar.provincia+" y es modelo: " + this.year;

        
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

    public int getNumeroContinente() {
        var retorno = 0;
        var marcaPais = this.getPaisMarca();
        switch (marcaPais) {
            case "EE.UU":
                retorno = 2;
                break;
            case "Japón":
                retorno = 3;
                break;
            default:
                retorno = 0;
        }
        return retorno;
    }

    public double calcularIVA() {
        var retorno = 0.0d;
        retorno = this.precio * 0.12;

        return retorno;
    }

    public int calcularEdad(int yearActual) {
        var retorno = 0;
        retorno = yearActual - this.year;

        return retorno;
    }

    //10% por cada año de uso
    //La depreciacion no puede exceder el precio
    public double calcularDepreciacion(int yearActual) {
        var retorno = 0.0d;
        var edad = this.calcularEdad(yearActual);
        retorno = edad * 0.10 * this.precio;
        if(retorno>this.precio){
            
        }

        return retorno;
    }

    /*
    Edad 0-5: 10% del precio
    Edad 5-10: 8% del precio
    Edad 10-15: 7% del precio
    Edad >15: 6% del precio
     */
    public double calcularCostoMatricula(int yearActual) {
        var retorno = 0.0d;
        var edad = this.calcularEdad(yearActual);
        if ((edad >= 0) && (edad < 5)) {
            retorno = this.precio * 0.10;
        } else {
            if ((edad >= 5) && (edad < 10)) {
                retorno = this.precio * 0.08;
            } else {
                if ((edad >= 10) && (edad < 15)) {
                    retorno = this.precio * 0.07;
                } else {
                    if (edad > 15) {
                        retorno = this.precio * 0.06;
                    }
                }
            }
            
        }
        return retorno;
    }
            /*
    Edad 0-5 y precio de 10000 SI
    Edad 10-15 y precio de 10000 a 20000 SI
    Edad >15 y precio de 20000 a 30000 SI
    Edad >15 NO
             */
    public boolean sePuedeAsegurar(int yearActual) {
        var retorno = false;
        var edad = this.calcularEdad(yearActual);
        if (edad <= 5 && this.precio < 10000) {
            retorno = true;
        } else {
            if (edad <= 5 && this.precio >= 10000 & this.precio < 20000) {
                retorno = true;
            } else {
                if (edad >= 10 && edad <= 15 && this.precio >= 20000 && this.precio < 30000) {
                    retorno = true;
                } else {
                    if (edad > 15) {
                        retorno = false;
                    } else {
                    }
                }
            }
            
        }
        return retorno;
    }
    
    
    public boolean esClasico(){
     var retorno=false;
     
     return retorno;
    }
    /*
    edad 0-5 y cilin.<1500:T.S 15% costo
    edad 0-5 y cilin.>1500<2000:T.S 20% costo
    edad 0-5 y cilin.>2000:T.S 25% costo
    edad 5-15 y cilin.<1500:T.S 10% costo
    edad 5-15 y cilin.>1500<2000:T.S 15% costo
    edad 5-15 y cilin.>2000:T.S 18% costo
    edad 15-20 T.S 5% costo
    edad>20:T.S 0
    */
    public double calculaeTasaSolidaria(int yearActual, double limitePrecio){
        var retorno=0.0d;
        var edad = this.calcularEdad(yearActual);
        if((edad>=0)&&(edad<5)&&(cilindraje<1500)){
            retorno=precio*0.15;
        }
        if((edad>=0)&&(edad<5)&&(cilindraje>1500)&&(cilindraje<2000)){
            retorno=precio*0.20;
        }
        if((edad>=0)&&(edad<5)&&(cilindraje>2000)){
            retorno=precio*0.25;
        }
        if((edad>=5)&&(edad<15)&&(cilindraje<1500)){
            retorno=precio*0.10;
        }
        if((edad>=5)&&(edad<15)&&(cilindraje>1500)&&(cilindraje<2000)){
            retorno=precio*0.15;
        }
        if((edad>=5)&&(edad<15)&&(cilindraje<2000)){
            retorno=precio*0.18;
        }
        if((edad>=15)&&(edad<20)){
            retorno=precio*0.5;
        }
        if((edad>20)){
            retorno=precio;
        }
        
        return retorno;
    }
    
    
    public boolean esPlacaValida(){
        var retorno=false;
        var longitud=this.placa.length();
        if(longitud==7){
            var caracter1=this.placa.charAt(0);
            var caracter2=this.placa.charAt(1);
            var caracter3=this.placa.charAt(2);
            var caracter4=this.placa.charAt(3);
            var caracter5=this.placa.charAt(4);
            var caracter6=this.placa.charAt(5);
            var caracter7=this.placa.charAt(6);
            
            if(Character.isLetter(caracter1)&&Character.isLetter(caracter2)
                &&Character.isLetter(caracter3)&&Character.isDigit(caracter4)
                &&Character.isDigit(caracter5)&&Character.isDigit(caracter6)
                &&Character.isDigit(caracter7)){
                
                retorno=true;
            }
        }
        
        return retorno;
    }
    
    
    
    
    
}


   

    
