package proyecto.proyecto.estructuras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ListaEnlazadaTest {

    @Test
    void listaNuevaEstaVacia() {
        ListaEnlazada lista = new ListaEnlazada();
        assertTrue(lista.estaVacia());
        assertEquals(0, lista.getTamano());
    }

    @Test
    void agregarAumentaElTamanoYMantieneElOrden() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar("A");
        lista.agregar("B");
        assertEquals(2, lista.getTamano());
        assertEquals("A", lista.aLista().get(0));
        assertEquals("B", lista.aLista().get(1));
    }

    @Test
    void eliminarQuitaElElemento() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar("A");
        lista.agregar("B");
        lista.agregar("C");
        assertTrue(lista.eliminar("B"));
        assertEquals(2, lista.getTamano());
        assertFalse(lista.aLista().contains("B"));
    }

    @Test
    void eliminarValorInexistenteDevuelveFalse() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar("A");
        assertFalse(lista.eliminar("Z"));
        assertEquals(1, lista.getTamano());
    }
}
