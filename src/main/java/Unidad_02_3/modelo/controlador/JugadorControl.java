/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_3.modelo.controlador;

import Unidad_02_3.modelo.Jugador;
import Unidad_02_3.servicio.JugadorServiceImpl;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author sebas
 */
public class JugadorControl {

    private JugadorServiceImpl jugadorServiceImpl;

    public JugadorControl() {
        this.jugadorServiceImpl = new jugadorServiceImpl();
    }
    
    

    public void crear(String[] data) {
        var retorno = "No se pudo crear el jugador";
        var codigo = Integer.valueOf(data[0]).intValue();
        var nombre = data[1];
        var peso = Double.valueOf(data[2]).doubleValue();
        var estatura = Integer.valueOf(data[3]).intValue();
        var year = Integer.valueOf(data[4]).intValue();
        var mes = Integer.valueOf(data[5]).intValue();
        var dia = Integer.valueOf(data[6]).intValue();

        if(peso<0 || estatura<0){
            retorno+=" Peso o estatura no son correctas";
        }else{
            var jugador = new Jugador(codigo,nombre,peso,estatura,LocalDate.of(year, mes, dia));
            this.jugadorServiceImpl.crear(jugador);
            retorno= "Jugador "+jugador.getNombre()+" creado correctamente";
        }
        return retorno;
    }
    
}
