/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorgrafico.Modelo;

import java.util.ArrayList;
import java.util.List;

public class gestorTareas {

    private final tarea[] tareas;
    private int contadorTareas;

    public gestorTareas() {
        tareas = new tarea[10];
        contadorTareas = 0;
    }

    public void agregarTarea(int id, String titulo, String descripcion, boolean tareaCompletada) {
        if (contadorTareas < tareas.length) {
            tareas[contadorTareas] = new tarea(id, titulo, descripcion, tareaCompletada);
            System.out.println("Tarea añadida" + id + titulo + descripcion + tareaCompletada);
            contadorTareas++;
        } else {
            System.out.println("No se pueden agregar mas tareas.");
        }
    }

    public List<tarea> listarTareaPendiente() {
        List<tarea> tareasPendientes = new ArrayList<>();
        System.out.println("Tareas Pendientes");
        for (int i = 0; i < contadorTareas; i++) {
            if (!tareas[i].isTareaCompletada()) {
                System.out.println(i + "; " + tareas[i].getDescripcion());
                tareasPendientes.add(tareas[i]);
            }
        }
        return tareasPendientes;
    }

    public List<tarea> listarTareaCompleta() {
        List<tarea> tareasCompletadas = new ArrayList<>();
        System.out.println("Tareas Completadas");
        for (int i = 0; i < contadorTareas; i++) {
            if (tareas[i].isTareaCompletada()) {
                System.out.println(i + "; " + tareas[i].getDescripcion());
                tareasCompletadas.add(tareas[i]);

            }
        }
        return tareasCompletadas;
    }

    public void marcarComoCompleta(int id) {
        if (id < 0) {
            System.out.println("ID de tarea no valido");
        } else {
            if (id >= contadorTareas) {
                System.out.println("ID de tarea no valido");
            } else {
                tareas[id].setTareaCompletada(true);
                System.out.println("Tarea marcada como completada" + tareas[id].getDescripcion());
            }
        }

    }

}
