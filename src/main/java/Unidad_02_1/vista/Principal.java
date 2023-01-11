/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_1.vista;

import Unidad_02_1.Atencion;
import Unidad_02_1.Mascota;
import Unidad_02_1.Receta;
import java.time.LocalDate;
import java.time.Month;



/**
 *
 * @author sebas
 */
public class Principal {
   public static void main(String[] args) {
       
        var mauricio = new Unidad_02_1.Dueño("0103667754","Mauricio Ortiz",3);
        mauricio.nuevoTelefono("0984357604", 0, "Móvil", "tuenti",0);
        mauricio.nuevoTelefono("074078385",2,"Casa","Etapa",1);
        mauricio.nuevoTelefono("074135250",1287,"Fijo IP","Etapa",2);
        
        System.out.println(mauricio.toString());
        var pilichi = new Mascota("Pilichi","Gato","Mestizo","15 Kg",mauricio);
        var atencion = new Atencion(LocalDate.of(2022, Month.OCTOBER, 20)
                ,"Dr. Masache",45,pilichi,2);
        atencion.nuevaReceta("paracetamol", 24, "1 cada 8 horas", 0);
        atencion.nuevaReceta("suero", 1, "1 hasta finalizar", 1);
        
        
        
        
        System.out.println(mauricio.toString());
        System.out.println(pilichi.toString());
        System.out.println(atencion.toString());
        System.out.println("El día de la atencion fué: "
                +atencion.getFecha().getDayOfWeek().name());
        var receta1 =new Receta("Apronax",2,"Luego de cada comida");
        System.out.println(receta1.toString());
        System.out.println(atencion.toString());
         
         
    }
}