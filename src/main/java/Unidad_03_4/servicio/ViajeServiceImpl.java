/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_03_4.servicio;

import Unidad_03_4.modelo.Viaje;
import Unidad_03_5.modelo.Viaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class ViajeServiceImpl implements ViajeService{

    private List<Viaje> viajeList;

    public ViajeServiceImpl() {
        viajeList= new ArrayList<>();
    }
    
    @Override
    public void crear(Viaje viaje) {
        this.viajeList.add(viaje);
    }

    @Override
    public List<Viaje> listar() {
        return this.viajeList;
    }
    
}
