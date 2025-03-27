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

        cajoneria.add(caja1);
        cajoneria.add(caja2);
        cajoneria.add(caja3);
        cajoneria.add(caja4);
        cajoneria.add(caja5);

        System.out.println("Cajoneria Inicial: ");
        System.out.println(cajoneria);

        System.out.println("Búsqueda: ");
        System.out.println(cajoneria.search(new Golosina("Caramelo", 4.0)));
        System.out.println(cajoneria.search(new Golosina("Galleta", 2.0))); 

        System.out.println("Eliminación: ");
        System.out.println("Elemento eliminado: " + cajoneria.delete(new Golosina("Chupetin", 2.0))); 
        System.out.println("Elemento eliminado: " + cajoneria.delete(new Golosina("Galleta", 2.0)));  


    }
}
