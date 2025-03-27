package Ejercicios;

public class Chocolatina {
    private String marca;

    public Chocolatina (String marca){
        this.marca=marca;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Chocolatina)) return false;
        Chocolatina c = (Chocolatina) obj;
        return this.nombre.equals(c.nombre) && this.peso == c.peso;
    }

    @Override
    public String toString() {
        return "Chocolatina[nombre=" + nombre + ", peso=" + peso + "]";
    }
}

