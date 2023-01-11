/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Unidad_02_3.servicio;

import Unidad_02_3.modelo.Estudiante;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface EstudianteService {
    public abstract void crear(Estudiante estudiante);
    public abstract void modificar(int codigo,Estudiante estudianteModificado);
    public abstract void eliminar(int codigo);
    public abstract List<Estudiante> listar();
}
