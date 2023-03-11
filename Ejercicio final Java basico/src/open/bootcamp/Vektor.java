package open.bootcamp;

import java.util.Vector;

public class Vektor {
    public static void main(String[] args) {
        System.out.println("***Vector*** \n");
        Vector <String> vectores = new Vector<>();

        vectores.add("txt1");
        vectores.add("txt2");
        vectores.add("txt3");
        vectores.add("txt4");
        vectores.add("txt5");

        System.out.println("Valores originales: " + vectores + "\n");

        vectores.remove("txt2");
        vectores.remove("txt3");

        System.out.println("Valores nuevos: " + vectores);

        System.out.println("""
                
                Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
                1000 elementos para ser añadidos al mismo. \n""");

        System.out.println("Desperdiciamos mucha memoria del sistema, ya que cada vez que se sobrepasa el limite \n"+
                "establecido la dimension del vector se duplica.");
    }
}
