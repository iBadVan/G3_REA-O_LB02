package Ejercicios;

import java.util.ArrayList;

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
            System.out.println("La cajonería está llena.");
        }
    }
}
