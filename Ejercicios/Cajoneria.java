package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class Cajoneria implements Iterable<Caja<?>>{

    private ArrayList<Caja<?>> lista;
    private int tope;

    public Cajoneria(int tope) {
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
    
    @Override
    public Iterator<Caja<?>> iterator() {
        return lista.iterator();
    }
}
