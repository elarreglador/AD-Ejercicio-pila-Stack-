import java.util.LinkedList;

public class Pila<T> implements Stack<T> {
    public static void main(String[] args) {
        // EJEMPLO DE USO

        // Creamos una nueva pila de Strings
        Pila<String> miPila = new Pila<>();
        // Verificamos si esta vacia
        System.out.println("Pila vacia: " + miPila.isEmpty());
        // Agregamos tres elementos
        System.out.println("Agregamos tres elementos...");
        miPila.push("primero");
        miPila.push("segundo");
        miPila.push("tercero");
        // Verificamos que no esta vacia
        System.out.println("Pila vacia: " + miPila.isEmpty());
        // Vemos el elemento superior
        System.out.println("Elementos superior de la pila: "+ miPila.peek());
        // Eliminamos elemento superior
        System.out.println("Quitamos el objeto superior: "+ miPila.pop());
        // Vemos el elemento superior
        System.out.println("Elementos superior de la pila: "+ miPila.peek());
    }

    private LinkedList<T> listado = new LinkedList<>();
    // Constructor (no es necesario)
    public Pila(){}

    @Override
    // Agrega un elemento a la pila
    public void push(T elemento) {
        listado.add(elemento);
        System.out.println("  * Agregado elemento "+elemento);
    }

    @Override
    // Elimina y devuelve el elemento superior de la pila
    public T pop() {
        System.out.println("  * Eliminado objeto superior de la lista");
        return listado.removeLast();
    }

    @Override
    // Devuelve el valor de dato en la cima de la pila
    public T peek() {
        System.out.println("  * Consultado ultimo elemento");
        return listado.getLast();
    }

    @Override
    // Verifica si la pila está vacía
    public boolean isEmpty() {
        System.out.println("  * Consultado estado de la lista");
        if (listado.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
