package Actividades;
import java.util.Iterator;
import java.util.ArrayList;

public class Bolsa <T> implements Iterable <T>{
    private ArrayList <T> lista= new ArrayList<T>();
    private int tope;

    public Bolsa(int tope){
        super();
        this.tope=tope;
    }

    
}