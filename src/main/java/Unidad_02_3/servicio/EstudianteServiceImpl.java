/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_02_3.servicio;

import Unidad_02_3.modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class EstudianteServiceImpl implements EstudianteService{
    private List<Estudiante> estudianteList;

    public EstudianteServiceImpl() {
        this.estudianteList = new ArrayList();
    }

    public void crear(Estudiante estudiante) {
        this.estudianteList.add(estudiante);
    }

    public List<Estudiante> listar() {
        return this.estudianteList;
    }

    public void eliminar(int codigo) {
        var indice=0;
        for(var jugador:this.estudianteList){
            if(jugador.getCodigo()==codigo){
                this.estudianteList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    @Override
    public void modificar(int codigo, Estudiante estudianteModificado) {
        var indice=0;
        
        this.estudianteList.set(indice, estudianteModificado);
    
    }

}
    
