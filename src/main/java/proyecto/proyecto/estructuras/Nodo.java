package proyecto.proyecto.estructuras;

/**
 * Nodo de una lista enlazada.
 * Guarda un valor y una referencia al siguiente nodo.
 * Es la pieza basica de una estructura dinamica: los nodos se enlazan
 * entre si en tiempo de ejecucion, sin un tamano fijo.
 */
public class Nodo {

    private String valor;
    private Nodo siguiente;

    public Nodo(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
