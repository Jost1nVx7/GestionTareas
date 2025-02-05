
package com.mycompany.gestorgrafico.Controlador;

import com.mycompany.gestorgrafico.Modelo.gestorTareas;
import com.mycompany.gestorgrafico.Vista.Vista;


public class controlador {
    private Vista vista;
    private gestorTareas modelo;

    public controlador(Vista vista) {
        this.vista = vista;
        this.modelo = new gestorTareas();
    }
    
    public void porcesoGestorTareas(){
        /*si los datos estan correctos pasa al modelo
        caso contrario los devuelve a la vista
                */
        
    }
    
    
}

