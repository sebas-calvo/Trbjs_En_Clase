/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_03_5.controlador;

import Unidad_03_5.modelo.Ciudad;
import Unidad_03_5.servicio.CiudadServiceImpl;
import java.util.List;

/**
 *
 * @author sebas
 */
public class CiudadControl {

    private CiudadServiceImpl ciudadServiceImpl = new CiudadServiceImpl();

    public void crear(String[] data) throws Exception{
        try {
            var codigo = Integer.valueOf(data[0]);
            var nombre = data[1];
            var pais = data[2];
            var poblacion = Integer.valueOf(data[3]);
            var ciudad = new Ciudad(codigo, nombre, pais, poblacion);
            if (this.codigoExiste(codigo)) {
                throw new RuntimeException("Código existe");
            } else {
                this.ciudadServiceImpl.crear(ciudad);
            }
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato");
        }

    }

    public boolean codigoExiste(int codigoActual) {
        var retorno = false;

        return retorno;
    }

    public List<Ciudad> listar() {
        return this.ciudadServiceImpl.listar();
    }

}
