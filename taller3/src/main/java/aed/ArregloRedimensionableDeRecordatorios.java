package aed;

import java.util.Arrays;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {

    private int size;
    private int cap;
    private Arrays lista;

    public ArregloRedimensionableDeRecordatorios() {
        this.size = 0;
        this.cap = 1;
        this.lista = [];
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.size = vector.size;
        this.cap = vector.cap
    }

    public int longitud() {
        return this.size;
    }

    public void agregarAtras(Recordatorio i) {
        if (this.size >= this.cap) {
            return null;
        }
    }

    public Recordatorio obtener(int i) {
        return this.lista[i];
    }

    public void quitarAtras() {
        return null;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        return null;

    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        return null;
    }

}
