/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_03_5.controlador;

import Unidad_03_5.modelo.Viaje;
import Unidad_03_5.servicio.ViajeServiceImpl;
import Unidad_03_5.servicio.CiudadServiceImpl;
import java.time.LocalDate;
import java.util.List;
import java.time.Month;

/**
 *
 * @author sebas
 */
public class ViajeControl {

    private ViajeServiceImpl viajeServiceImpl = new ViajeServiceImpl();
    private CiudadServiceImpl ciudadServiceImpl = new CiudadServiceImpl();

    public void crear(String[] data) throws Exception {
        try {
            var codigo = Integer.valueOf(data[0]);
            var origen = this.ciudadServiceImpl.buscarPorCodigo(Integer.valueOf(data[1]));
            var destino = this.ciudadServiceImpl.buscarPorCodigo(Integer.valueOf(data[2]));
            var year = Integer.valueOf(data[3]);
            var mes = Integer.valueOf(data[4]);
            var dia = Integer.valueOf(data[5]);
            var viaje = new Viaje(codigo, origen, destino, LocalDate.of(year, mes, dia));
            if (this.codigoExiste(codigo)) {
                throw new RuntimeException("Código existe");
            } else {
                this.viajeServiceImpl.crear(viaje);
            }
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato");
        }

    }
    
    public boolean codigoExiste(int codigoActual) {
        var retorno = false;

        return retorno;
    }

    public List<Viaje> listar() {
        return this.viajeServiceImpl.listar();
    }
}
