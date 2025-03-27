package Ejercicios;

public class TestGen  {
    public static void main(String[] args) {
        Cajoneria cajoneria = new Cajoneria(5);

        Caja<Golosina> caja1 = new Caja<>("rojo");
        caja1.guardar(new Golosina("Chupetin", 2.0));

        Caja<Golosina> caja2 = new Caja<>("azul");
        caja2.guardar(new Golosina("Caramelo", 4.0));

        Caja<Golosina> caja3 = new Caja<>("verde");
        caja3.guardar(new Golosina("Paleita", 5.5));

        Caja<Golosina> caja4 = new Caja<>("amarillo");
        caja4.guardar(new Golosina("Gomita", 1.5));

        Caja<Golosina> caja5 = new Caja<>("rosado");
        caja5.guardar(new Golosina("Chocolate", 3.0));


    }
}
