************************************
ACERCA DEL AUTOR
************************************

David M.

elarreglador@protonmail.cocm

https://github.com/elarreglador


************************************
ENUNCIADO
************************************

Crea una colección de datos que funcione como una pila (LIFO). 

La pila debe contener datos de cualquier tipo. 

Todos los datos de una instancia de pila debe asegurarse que sean del mismo tipo en tiempo de 
compilación. Para ello usa genéricos de java. Crea un interfaz y llámala Stack. 

Conviene separar la interfaz que fija como se debe invocar los métodos de la pila, de su 
implementación, para poder implementar la pila mediante diferentes estrategias y que estas 
sean intercambiables en el código que usa la pila mediante una referencia a la interface 
(polimorfismo). 

La interfaz debe tener estos metodos:

 * push para apilar nuevos datos en la estructura 
 * pop para desapilarlos. El método pop devuelve el valor del dato desapilado.
 * peek devuelve el valor de dato en la cima de la pila
 * isEmpty que devuelve un booleano true si la pila está vacía.

Implementa la interfaz pila mediante una lista de nodos enlazada, llama a la clase LinkedStack.

