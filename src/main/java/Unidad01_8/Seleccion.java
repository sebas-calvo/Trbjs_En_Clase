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
    String confederacion;
    int participacionesMundial;

    public String obtienePais() {
        var retorno = "desconocido";

        switch (codigoFIFA) {
            case "ECU":
                retorno="Ecuador";
                break;
            case "AFA":
                retorno="Argentina";
                break;
            case "BRA":
                retorno="Brasil";
                break;
            default:
                throw new AssertionError();
        }
        return retorno;
    }

}
