package proyecto.proyecto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import proyecto.proyecto.estructuras.ListaEnlazada;

/**
 * Muestra en una pagina web dos tipos de estructuras de datos:
 *  - Estatica: un arreglo de tamano fijo.
 *  - Dinamica: una lista enlazada que crece y decrece en tiempo de ejecucion.
 */
@Controller
public class EstructurasController {

    // Estructura ESTATICA: el tamano se define al declararla y no cambia.
    private final String[] arregloEstatico = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

    // Estructura DINAMICA: se le pueden agregar o quitar elementos en tiempo de ejecucion.
    private final ListaEnlazada listaDinamica = new ListaEnlazada();

    public EstructurasController() {
        // Algunos valores de ejemplo para que la lista no empiece vacia.
        listaDinamica.agregar("Arreglo");
        listaDinamica.agregar("Lista enlazada");
        listaDinamica.agregar("Pila");
    }

    @GetMapping("/estructuras")
    public String estructuras(Model model) {
        model.addAttribute("arreglo", arregloEstatico);
        model.addAttribute("lista", listaDinamica.aLista());
        model.addAttribute("tamano", listaDinamica.getTamano());
        return "estructuras";
    }

    @PostMapping("/estructuras/agregar")
    public String agregar(@RequestParam String valor) {
        if (valor != null && !valor.isBlank()) {
            listaDinamica.agregar(valor.trim());
        }
        return "redirect:/estructuras";
    }

    @PostMapping("/estructuras/eliminar")
    public String eliminar(@RequestParam String valor) {
        listaDinamica.eliminar(valor);
        return "redirect:/estructuras";
    }
}
