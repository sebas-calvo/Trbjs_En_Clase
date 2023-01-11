/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Unidad_03_4.servicio;

import Unidad_03_4.modelo.Viaje;
import Unidad_03_5.modelo.Viaje;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface ViajeService {
    
    public void crear(Viaje viaje);
    public List<Viaje> listar();
    
}
