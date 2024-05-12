package aed;

import java.util.*;

public class ListaEnlazada<T> implements Secuencia<T> {
    
    private int size;
    private Nodo primero;
    //private Nodo ultimo;

    private class Nodo {
        private Nodo anterior;
        private T elem;
        private Nodo siguiente;

        private Nodo(T value){
            this.elem = value;
            this.anterior = null;
            this.siguiente = null;
        }
    }

    public ListaEnlazada() {
        this.size = 0;
        this.primero = null;
    }

    public int longitud() {
        return this.size;
    }

    public void agregarAdelante(T elem) {
        if(size == 0){
            this.primero = new Nodo(elem);
            size = 1;
        }
        else{
            Nodo primeroViejo = this.primero;
            this.primero = new Nodo(elem);
            this.primero.siguiente = primeroViejo;
            size += 1;
        }
    }

    public void agregarAtras(T elem) {
        if(size == 0){
            this.primero = new Nodo(elem);
            size = 1;
        }
        else{
            Nodo actual = this.primero;
            
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }

            Nodo nuevoNodo = new Nodo(elem);
            actual.siguiente = nuevoNodo;
            nuevoNodo.anterior = actual;
            size += 1;
        }
    }

    public T obtener(int i) {
        Nodo actual = this.primero;
        
        for(int j=0; j < i; j++){
            actual = actual.siguiente;
        }
        
        return actual.elem;
    }

    public void eliminar(int i) {
        Nodo actual = this.primero;
        
        if (this.size == i + 1){

            for(int j=0; j < i - 1; j++){
                actual = actual.siguiente;
            }

            actual.siguiente = null;
            size -= 1;

        } else if (i == 0) {
            
            Nodo nuevoPrimero = this.primero.siguiente;
            this.primero = nuevoPrimero;
            size -= 1;

        } else {
            for(int j=0; j < i; j++){
                actual = actual.siguiente;
            }
            
            Nodo nodoAnterior = actual.anterior;
            Nodo nodoSiguiente = actual.siguiente;
                    
            nodoSiguiente.anterior = nodoAnterior;
            nodoAnterior.siguiente = nodoSiguiente;
            size -= 1;
        }
    }

    public void modificarPosicion(int indice, T elem) {
        Nodo actual = this.primero;

        for(int j=0; j < indice; j++){
            actual = actual.siguiente;
        }

        actual.elem = elem;
    }

    public ListaEnlazada<T> copiar() {
        ListaEnlazada<T> copia = new ListaEnlazada<>();
        Nodo actual = this.primero;

        for(int i = 0; i < this.size; i++){
            copia.agregarAtras(actual.elem);
            actual = actual.siguiente;
        }
        
        return copia;
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        
        ListaEnlazada listacopiada = lista.copiar();
        
        this.size = lista.size;
        this.primero = listacopiada.primero;
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    private class ListaIterador implements Iterador<T> {
    	
        Nodo indice;

        private ListaIterador(ListaEnlazada<T> lista){
            this.indice = new Nodo(null);
            this.indice.siguiente = lista.primero;
            lista.primero.anterior = this.indice;
        }

        public boolean haySiguiente() {
            if(this.indice == null){
                return false;
            } else {
                return this.indice.siguiente != null;
            }
        }
        
        public boolean hayAnterior() {
	        if(this.indice == null){
                return false;
            } else {
                return this.indice.anterior != null;
            }
        }

        public T siguiente() {
	        this.indice = this.indice.siguiente;
            return this.indice.elem;
        }

        public T anterior() {
            T actualValue = this.indice.elem; 
            this.indice = this.indice.anterior;
            return actualValue;
        }
    }

    public Iterador<T> iterador() {
	    Iterador<T> iterador = new ListaIterador(this);
        return iterador;
    }

}
