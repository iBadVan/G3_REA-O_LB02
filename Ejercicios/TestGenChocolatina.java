package Ejercicios;

public class TestGenChocolatina {
    public static void main(String[] args) {
        Cajoneria cajoneria = new Cajoneria(5);

        Caja<Chocolatina> caja1 = new Caja<>("rojo");
        caja1.guardar(new Chocolatina("Milka"));

        Caja<Chocolatina> caja2 = new Caja<>("azul");
        caja2.guardar(new Chocolatina("Ferrero"));

        Caja<Chocolatina> caja3 = new Caja<>("verde");
        caja3.guardar(new Chocolatina("Sublime"));

        Caja<Chocolatina> caja4 = new Caja<>("amarillo");
        caja4.guardar(new Chocolatina("Nestle"));

        Caja<Chocolatina> caja5 = new Caja<>("rosado");
        caja5.guardar(new Chocolatina("Kinder"));

        cajoneria.add(caja1);
        cajoneria.add(caja2);
        cajoneria.add(caja3);
        cajoneria.add(caja4);
        cajoneria.add(caja5);

        System.out.println("Cajoneria Inicial: ");
        System.out.println(cajoneria);

        System.out.println("Búsqueda:");
        System.out.println(cajoneria.search(new Chocolatina("Ferrero")));
        System.out.println(cajoneria.search(new Chocolatina("Princesa")));

        System.out.println("Eliminación:");
        System.out.println("Elemento eliminado: " + cajoneria.delete(new Chocolatina("Milka")));
        System.out.println("Elemento eliminado: " + cajoneria.delete(new Chocolatina("Princesa")));

        System.out.println("--- Cajoneria Final ---");
        System.out.println(cajoneria);
    }
}
