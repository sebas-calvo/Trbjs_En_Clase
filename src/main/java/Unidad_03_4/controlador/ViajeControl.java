/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_03_4.controlador;


import Unidad_03_4.modelo.Viaje;
import Unidad_03_5.modelo.Viaje;
import Unidad_03_5.servicio.ViajeServiceImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author sebas
 */
public class ViajeControl {
    
    private ViajeServiceImpl viajeServiceImpl;
       

    public ViajeControl() {
        
        viajeServiceImpl= new ViajeServiceImpl();
    }
    
    
    public void crear(String [] data){
        var codigo=Integer.valueOf(data[0]).intValue();
        var origen=data[1];
        var destino=data[2];
        var year=Integer.valueOf(data[3]).intValue();
        var month=Integer.valueOf(data[4]).intValue();
        var day=Integer.valueOf(data[5]).intValue();
        var fecha = LocalDate.of(year,month, day);
        
        var viaje= new Viaje(codigo,origen,destino,fecha);
        this.viajeServiceImpl.crear(viaje);
    }
    
    public List<Viaje> listar(){
        return this.viajeServiceImpl.listar();
    }
    
}
