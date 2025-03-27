package Ejercicios;

public class Caja  <T> {
    private String color;
    private T contenido;

    public Caja(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void guardar(T contenido) {
        this.contenido = contenido;
    }

    public T obtenerContenido() {
        return contenido;
    }
}
