package proyecto.proyecto.estructuras;

import java.util.ArrayList;
import java.util.List;

/**
 * Lista enlazada simple (estructura de datos DINAMICA).
 *
 * A diferencia de un arreglo, no tiene un tamano fijo: crece y decrece
 * en tiempo de ejecucion agregando o eliminando nodos. Cada nodo apunta
 * al siguiente, formando una cadena que empieza en la "cabeza".
 */
public class ListaEnlazada {

    private Nodo cabeza;
    private int tamano;

    /** Agrega un valor al final de la lista. */
    public void agregar(String valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamano++;
    }

    /**
     * Elimina la primera aparicion del valor indicado.
     * @return true si se elimino, false si no estaba en la lista.
     */
    public boolean eliminar(String valor) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.getValor().equals(valor)) {
            cabeza = cabeza.getSiguiente();
            tamano--;
            return true;
        }
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getValor().equals(valor)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                tamano--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    /** Recorre la lista y devuelve sus valores en orden. */
    public List<String> aLista() {
        List<String> elementos = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            elementos.add(actual.getValor());
            actual = actual.getSiguiente();
        }
        return elementos;
    }

    public int getTamano() {
        return tamano;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }
}
