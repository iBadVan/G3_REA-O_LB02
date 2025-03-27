package Ejercicios;

public class DemoMetodoGenerico {
    static <T extends Comparable<T>> boolean igualArrays(T[] x, T[] y) {
        // Si las longitudes de los arrays son diferentes, no son iguales
        if (x.length != y.length)
            return false;

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i]))
                return false; 
        }
        return true; 
    }     

    static <T> boolean exist(T[] arreglo, T valor) {
        for (T valorrecorrido : arreglo){
            if(valorrecorrido.equals(valor)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[]={1,2,3,4,5};
        Integer nums2[]={1,2,3,4,5};
        Integer nums3[]={1,2,7,4,5};
        Integer nums4[]={1,2,7,4,5,6};
        if (igualArrays(nums,nums))
            System.out.println("nums es igual a nums");
        if (igualArrays(nums,nums2))
            System.out.println("nums es igual a nums2");
        if (igualArrays(nums,nums3))
            System.out.println("nums es igual a num3");
        if (igualArrays(nums,nums4))
            System.out.println("nums es igual a nums4");

        Double dvals1[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Double dvals2[] = {1.1, 2.2, 3.3, 4.4, 5.5};
    
        if (igualArrays(dvals1, dvals2)){
            System.out.println("dvals1 es igual a dvals2");
        }
        
        String [] nombres = {"Ivan", "Oscar", "Piero"};
        Integer [] numeros = {1,2,3,4,5,6,7};
        System.out.println(exist(nombres,"Ivan"));
        System.out.println(exist(numeros,17));
        //System.out.println(exist(numeros,"Ivan"));



    }
}
