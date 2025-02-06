/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorgrafico.Modelo;

/**
 *
 * @author SO-LAB1-PC27
 */
public class Tareas {
    
    private int id;
    private String titulo;
    private String descripcion;
    private boolean estadoTarea;

    public Tareas(int id, String titulo, String descripcion, boolean estadoTarea) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estadoTarea = estadoTarea;
    }

    public Tareas() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(boolean estadoTarea) {
        this.estadoTarea = estadoTarea;
    }
    
    
    
}
