/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo.unidad01.oms_ejemplo;

/**
 *
 * @author sebas
 */
public class PooUnidad01Oms_ejemplo {

    public static void main(String[] args) {
        System.out.println("Clase 01_01_02");
        var perro1=new Perro();
        var perro2=new Perro();
        var perro3=new Perro();
        
        perro1.nombre="firulais";
        perro1.raza="mestizo";
        perro1.edad=5;
        
        var persona1=new Persona();
        
        persona1.cedula=898464527;
        persona1.edad=21;
        persona1.nombre="simon";
        
        var compu1=new Computador();
        
        compu1.capacidad="260 gb";
        compu1.marca="hp";
        compu1.modelo="A5";
        
        var auto1=new Auto();
        auto1.año=2020;
        auto1.marca="Toyota";
        auto1.placa="ABG-2431";
        
        System.out.println("mi perro se llama: "+perro1.nombre+" tiene "
                +perro1.edad+ " años"+" y es un " + perro1.raza);
        
        perro2.nombre="estiven";
        perro2.raza="pastor";
        perro2.edad=2;
        
        System.out.println("mi otro perro se llama: "+perro2.nombre+" tiene "
                +perro2.edad+ " años"+ " y es un " + perro2.raza);
   
        perro3.nombre="joven";
        perro3.raza="dalmata";
        perro3.edad=6;
        
        System.out.println("mi otro perro se llama: "+perro3.nombre+" tiene "
                +perro3.edad+ " años"+ " y es un " + perro3.raza);
        
        
        
    }
}
