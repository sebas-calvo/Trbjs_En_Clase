/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_3_4;

/**
 *
 * @author sebas
 */
public class Principal {
    public static void main(String[] args) {
        
        
        var auto1 = new Auto();
        auto1.placa="ABF8592";
        auto1.marca="Chevrolet";
        auto1.nombrePropietario="Juana Moreno";
        auto1.color="Azul";
        auto1.precio=30.000;
        auto1.year=2020;
        auto1.cilindraje=3000;

        System.out.println(auto1.mostrarInfo()+", el pais de origen es "
                +auto1.getPaisMarca()+" la placa es valida: "+auto1.esPlacaValida());
    
    
        var auto2 = new Auto();
        auto2.placa="GKA2131";
        auto2.marca="Toyota";
        auto2.nombrePropietario="Juanito";

        System.out.println(auto2.mostrarInfo()+" y el pais de origen es "
                +auto2.getPaisMarca());


        var auto3 = new Auto();
        auto3.placa="UBQ898";
        auto3.marca="Mercedez Benz";
        auto3.nombrePropietario="Martin Eljuri";

        System.out.println(auto3.mostrarInfo()+" y el pais de origen es "
                +auto3.getPaisMarca());
        
        
        var auto4 = new Auto();
        auto4.placa="PGE547";
        auto4.marca="Pagani";
        auto4.nombrePropietario="Antonio Abad";

        System.out.println(auto4.mostrarInfo()+" y el pais de origen es "
                +auto4.getPaisMarca());
    
        
    
        
        
        
        
        
        
    }}
    
    
    

    
