package com.mycompany.gestorgrafico.Controlador;

import com.mycompany.gestorgrafico.Modelo.Tareas;
import com.mycompany.gestorgrafico.Modelo.gestorTareas;
import com.mycompany.gestorgrafico.Modelo.tarea;
import com.mycompany.gestorgrafico.Vista.Pendiente;
import com.mycompany.gestorgrafico.Vista.Vista;
import java.util.List;

public class controlador {

    private Vista vista;
    private gestorTareas gestorTarea;
    private Tareas tarea;
    private Pendiente pendiente;

    public controlador(Vista vista) {
        this.vista = vista;
        this.gestorTarea = new gestorTareas();
        this.tarea = new Tareas();
    }

    /*public void porcesoGestorTareas(){
        /*si los datos estan correctos pasa al modelo
        caso contrario los devuelve a la vista
     */
    public void agregarTarea() {
        try {

            String titulo = vista.getTitulo();
            String descripcion = vista.getDescripcion();
            if (titulo != null && descripcion != null) {
                tarea.setTitulo(titulo);
                tarea.setDescripcion(descripcion);
                gestorTarea.agregarTarea(tarea);

            } else {
                vista.Error();
            }
        } catch (Error e) {

        }
    }

    public void listarTarea() {
        Tareas[] tareas = gestorTarea.listarTareaCompleta();
        String tareasPendientes="";
        for ( ) {
            //convertir el vector en un String
            tareasPendientes=tareasPendientes+
        }

        pendiente = new Pendiente();
        pendiente.mostrarPendientes(tareasPendientes);

    }
}

}
