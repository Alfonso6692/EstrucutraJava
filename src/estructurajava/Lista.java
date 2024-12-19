package estructurajava;


public class Lista {

    private Nodo cabeza = null;
    private int longitud = 0;

    private class Nodo {
        public Libro libro;
        public Nodo siguiente = null;

        public Nodo(Libro libro) {
            this.libro = libro;
        }
    }

    // Insertar al principio
    public void insertarPrincipio(Libro libro) {
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    // Insertar al final
    public void insertarFinal(Libro libro) {
        Nodo nodo = new Nodo(libro);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            puntero.siguiente = nodo;
        }
        longitud++;
    }

    // Insertar después de un índice específico
    public void insertarDespues(int n, Libro libro) {
        if (n >= longitud) {
            System.out.println("Índice fuera de rango.");
            return;
        }
        
        Nodo nodo = new Nodo(libro);
        Nodo puntero = cabeza;
        int contador = 0;
        
        while (contador < n) {
            puntero = puntero.siguiente;
            contador++;
        }
        
        nodo.siguiente = puntero.siguiente;
        puntero.siguiente = nodo;
        longitud++;
    }

    // Obtener un nodo por índice
    public Nodo obtener(int n) {
        if (n >= longitud || n < 0) {
            return null;
        }

        Nodo puntero = cabeza;
        int contador = 0;
        while (contador < n) {
            puntero = puntero.siguiente;
            contador++;
        }
        return puntero;
    }

    // Contar el número de elementos en la lista
    public int contar() {
        return longitud;
    }

    // Comprobar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Eliminar el primer elemento
    public void eliminarPincicio() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
            longitud--;
        }
    }

    // Eliminar el último elemento
    public void eliminarUltimo() {
        if (cabeza != null) {
            if (cabeza.siguiente == null) {
                cabeza = null;
            } else {
                Nodo puntero = cabeza;
                while (puntero.siguiente.siguiente != null) {
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
            }
            longitud--;
        }
    }

    // Eliminar un libro en una posición específica
    public void eliminarLibro(int n) {
        if (n < 0 || n >= longitud) {
            System.out.println("Índice fuera de rango.");
            return;
        }

        if (n == 0) {
            cabeza = cabeza.siguiente;  // Elimina el primer nodo
        } else {
            Nodo puntero = cabeza;
            for (int i = 0; i < n - 1; i++) {
                puntero = puntero.siguiente;
            }
            Nodo temp = puntero.siguiente;
            puntero.siguiente = temp.siguiente;  // Salta el nodo que se va a eliminar
        }
        longitud--;
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Nodo puntero = cabeza;
        while (puntero != null) {
            System.out.println(puntero.libro);
            puntero = puntero.siguiente;
        }
    }
}
