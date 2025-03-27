package Actividades;

public class DemoMetodoGenerico {
    static <T extends Comparable<T>> boolean igualArrays (T[] x, T[] y){
        //Si las longitudes de los array son diferentes,
        // entonces los array son diferentes
        if (x.length != y.length){
            return false;
        }

        for (int i = 0; i < x.length; i++){ 
            if(!x[i].equals(y[i])){
                return false;
            }else{
                return true; 
            }       
        }
    }       
}
