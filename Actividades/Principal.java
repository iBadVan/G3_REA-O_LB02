package Actividades;

public class Principal {
    public static void main(String[] args) { 
        Bolsa <Chocolatina> bolsaCho = new Bolsa <Chocolatina> (5);
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2); 
        for (Chocolatina chocolatina: bolsaCho) {
            System.out.println(chocolatina.getMarca());
        } 

        Bolsa <Golosina> bolsaGolo = new Bolsa <Golosina> (5);
        Golosina g = new Golosina("chupetin",2);
        Golosina g1 = new Golosina("caramelo",4);
        Golosina g2 = new Golosina("paletita", 17);
        bolsaGolo.add(g);
        bolsaGolo.add(g1);
        bolsaGolo.add(g2); 
        for (Golosina golosinita: bolsaGolo) {
            System.out.println(golosinita.getNombre());
            System.out.println(golosinita.getPeso());
        } 


    }
}