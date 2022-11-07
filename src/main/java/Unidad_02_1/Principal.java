/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author sebas
 */
public class Principal {
   public static void main(String[] args) {
       
        var mauricio = new Dueño("0103667754","Mauricio Ortiz",3);
        mauricio.nuevoTelefono("0984357604", 0, "Móvil", "tuenti",0);
        mauricio.nuevoTelefono("074078385",2,"Casa","Etapa",1);
        mauricio.nuevoTelefono("074135250",1287,"Fijo IP","Etapa",2);
        
        System.out.println(mauricio.toString());
        var pilichi = new Mascota("Pilichi","Gato","Mestizo","15 Kg",mauricio);
        //var atencion = new Atencion(LocalDate.now(),"Dr. Masache",45,pilichi);
        var atencion = new Atencion(LocalDate.of(2022, Month.OCTOBER, 20)
                ,"Dr. Masache",45,pilichi);
        System.out.println(mauricio.toString());
        System.out.println(pilichi.toString());
        System.out.println(atencion.toString());
        System.out.println("El día de la atencion fué: "
                +atencion.getFecha().getDayOfWeek().name());
        var receta1 =new Receta("Apronax",2,"Luego de cada comida");
         System.out.println(receta1.toString());
    }
}