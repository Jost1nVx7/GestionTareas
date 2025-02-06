package com.mycompany.gestorgrafico.Modelo;

public class gestorTareas {

    private Tareas[] tareas = new Tareas[5];
    private Tareas[] tareasAux = new Tareas[5];
    private int contadorTareas;

    public gestorTareas() {
        contadorTareas++;
    }

    public void agregarTarea(Tareas tareas) {
        for (int i = 0; i < 4; i++) {
            if (this.tareas[i] != null) {
                this.tareas[i].setTitulo(tareas.getTitulo());
                this.tareas[i].setDescripcion(tareas.getDescripcion());
                this.tareas[i].setId(contadorTareas);
            }
        }
    }

    public Tareas[] listarTareaPendiente() {
        tareasAux=null;
        for (int i = 0; i < 4; i++) {
            if (!this.tareas[i].getEstadoTarea()) {
                tareasAux[i] = tareas[i];
            }
        }
        return tareasAux;
    }

    public Tareas[] listarTareaCompleta() {
        tareasAux=null;
        for (int i = 0; i < 4; i++) {
            if (this.tareas[i].getEstadoTarea()) {
                tareasAux[i] = tareas[i];
            }
        }

        return tareasAux;
    }

    
    /*public List<tarea> listarTareaPendiente() {
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

    }*/
}
