/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Unidad_03_5.servicio;

import Unidad_03_5.modelo.Ciudad;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface CiudadService {
    
    public void crear(Ciudad ciudad);
    public Ciudad buscarPorCodigo(int codigo);
    public Ciudad buscarPorNombre(String nombre);
    public List<Ciudad> listar();
    
}
