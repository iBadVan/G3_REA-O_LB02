package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class Cajoneria implements Iterable<Caja<?>>{

    private ArrayList<Caja<?>> lista;
    private int tope;

    public Cajoneria(int tope) {
        super();
        this.tope = tope;
        lista = new ArrayList<>();
    }

    public void add(Caja<?> caja) {
        if (lista.size() < tope) {
            lista.add(caja);
        } else { 
            throw new RuntimeException("No cabe más");
        }
    }

    public String search(Object elemento) {
        for (int i = 0; i < lista.size(); i++) {
            Caja<?> caja = lista.get(i);
            if (elemento != null && elemento.equals(caja.obtenerContenido())) {
                return "Posición: " + (i + 1) + ", Color: " + caja.getColor();
            }
        }
        return "Elemento no encontrado";
    }

    public Object delete(Object elemento) {
        for (Caja<?> caja : lista) {
            if (elemento != null && elemento.equals(caja.obtenerContenido())) {
                Object eliminado = caja.obtenerContenido();
                caja.guardar(null); 
                return eliminado;
            }
        }
        return null;
    }

    


    
    @Override
    public Iterator<Caja<?>> iterator() {
        return lista.iterator();
    }
}
