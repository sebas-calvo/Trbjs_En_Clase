/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_8;

/**
 *
 * @author sebas
 */
public class Seleccion {

    String codigoFIFA;
    String nombre;
    String federacion;
    int participacionesMundial;

    public String obtienePais() {
        var retorno = "desconocido";

        switch (codigoFIFA) {
            case "ECU":
                return "Ecuador";
                break;
            case "ARG":
                return "Argentina";
                break;
            case "BRA":
                return "Brasil";
                break;
            default:
                throw new AssertionError();
        }
        return retorno;
    }

}
