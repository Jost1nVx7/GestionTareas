
package com.mycompany.gestorgrafico;

import com.mycompany.gestorgrafico.Modelo.gestorTareas;
import com.mycompany.gestorgrafico.Modelo.tarea;

/**
 *
 * @author DELL
 */

import com.mycompany.gestorgrafico.Vista.Vista;



public class GestorGrafico {

    public static void main(String[] args) {
        

        gestorTareas objtareas = new gestorTareas();
        
        objtareas.agregarTarea(0, "Programacion", "programe bien el codigo", true);
        objtareas.listarTareaCompleta();
        objtareas.listarTareaPendiente();
        objtareas.marcarComoCompleta(800);

        //Visualizar la interfas grafica
        Vista objinterfas = new Vista();
        objinterfas.setVisible(true);


    }
}
