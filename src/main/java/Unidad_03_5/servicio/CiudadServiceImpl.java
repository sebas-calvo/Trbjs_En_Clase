/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad_03_5.servicio;

import Unidad_03_5.modelo.Ciudad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class CiudadServiceImpl implements CiudadService {

    private List<Ciudad> ciudadList = new ArrayList<>();

    @Override
    public void crear(Ciudad ciudad) {
        this.ciudadList.add(ciudad);
    }

    @Override
    public List<Ciudad> listar() {
        return this.ciudadList;
    }

     @Override
    public Ciudad buscarPorCodigo(int codigo) {
        Ciudad retorno = null;
        for (var ciudad : this.ciudadList) {
            if (codigo == ciudad.getCodigo()) {
                retorno = ciudad;
                break;
            }
        }
        return retorno;
    }

    @Override
     public Ciudad buscarPorNombre(String nombre) {
        Ciudad retorno = null;
        
        for(var ciudad:this.ciudadList){
            if(nombre.equals(ciudad.getNombre())){
                retorno=ciudad;
                break;
            }
        }

        return retorno;
    }

}



    
