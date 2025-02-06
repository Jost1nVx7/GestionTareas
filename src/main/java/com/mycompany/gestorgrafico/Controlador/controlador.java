package com.mycompany.gestorgrafico.Controlador;

import com.mycompany.gestorgrafico.Modelo.gestorTareas;
import com.mycompany.gestorgrafico.Modelo.tarea;
import com.mycompany.gestorgrafico.Vista.Vista;
import java.util.List;

public class controlador {

    private Vista vista;
    private gestorTareas gestorTareas;

    ;

    public controlador(Vista vista) {
        this.vista = vista;
        this.gestorTareas = new gestorTareas();
    }

    /*public void porcesoGestorTareas(){
        /*si los datos estan correctos pasa al modelo
        caso contrario los devuelve a la vista
     */
    
        public void agregarTarea(int id, String titulo, String descripcion, boolean tareaCompletada) {
            gestorTareas.agregarTarea(id, titulo, descripcion, tareaCompletada);
        }

        public List<tarea> listarTareaPendiente() {
            return gestorTareas.listarTareaPendiente();
        }

        public List<tarea> listarTareaCompletada() {
            return gestorTareas.listarTareaCompleta();
        }

        public void marcarComoCompleta(int id) {
            gestorTareas.marcarComoCompleta(id);
        }

    }

