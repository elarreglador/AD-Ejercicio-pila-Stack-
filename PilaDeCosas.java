import java.io.File;

public class PilaDeCosas {
    public static void main(String[] args){
        Pila<Integer> enteros = new Pila<>();
        Pila<String> textos = new Pila<>();
        Pila<File> archivos = new Pila<>();

        enteros.push(10);
        enteros.push(100);
        enteros.push(1000);

        textos.push("diez");
        textos.push("cien");
        textos.push("mil");

        File diez = new File(".diez.txt");
        archivos.push(diez);
        File cien = new File(".cien.txt");
        archivos.push(cien);
        File mil = new File(".mil.txt");
        archivos.push(mil);


    }
}
